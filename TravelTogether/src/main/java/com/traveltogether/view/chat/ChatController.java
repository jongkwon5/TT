package com.traveltogether.view.chat;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.traveltogether.biz.board.BoardPageCreate;
import com.traveltogether.biz.board.BoardService;
import com.traveltogether.biz.board.Criteria;
import com.traveltogether.biz.chat.ChatCountDTO;
import com.traveltogether.biz.chat.ChatRoomDTO;
import com.traveltogether.biz.chat.impl.ChatRoomServiceImpl;
import com.traveltogether.biz.festival.FestivalService;
import com.traveltogether.biz.festival.FestivalVO;
import com.traveltogether.biz.festival.impl.FestivalServiceimpl;
import com.traveltogether.biz.member.MemberVO;
import com.traveltogether.biz.member.impl.MemberServiceimpl;

@Controller
@SessionAttributes("chatNumber")
public class ChatController {

    @Autowired
    private ChatRoomServiceImpl chatService;

    @RequestMapping(value = "chat-rooms", method = RequestMethod.GET)
    public ModelAndView getChatRoomList(HttpSession session, HttpServletRequest request, ChatRoomDTO chatRoomDTO, ChatCountDTO chatCountDTO) throws IOException {
        ModelAndView modelAndView = new ModelAndView("chatRoomList");
        if (session.getAttribute("chatNumber") != null) {
            deleteChatRoom(request, chatRoomDTO, chatCountDTO);
        }
        modelAndView.addObject("chatRoomList", chatService.getChatRoomList(chatRoomDTO));
        modelAndView.addObject("numberOfPeople", chatService.getNumberOfPeople(chatCountDTO));
        return modelAndView;
    }

    @RequestMapping(value = "chat-rooms", method = RequestMethod.POST)
    public ModelAndView createChatRoom(HttpSession session, ChatRoomDTO chatRoomDTO, ChatCountDTO chatCountDTO) throws IOException {
        ModelAndView modelAndView = new ModelAndView("chatRoom");
        chatService.createChatRoom(chatRoomDTO);
        chatService.chatRoomUserInsert(chatCountDTO);
        session.setAttribute("chatNumber", chatCountDTO.getChatNumber());
        modelAndView.addObject("chatRoom", chatService.getChatRoom(chatCountDTO.getChatNumber()));
        return modelAndView;
    }

    @RequestMapping(value = "chat-rooms/{chatNumber}", method = RequestMethod.POST)
    public ModelAndView joinChatRoom(@PathVariable("chatNumber") Integer chatNumber, ChatRoomDTO chatRoomDTO, ChatCountDTO chatCountDTO) throws IOException {
        ModelAndView modelAndView = new ModelAndView("chatRoom");
        chatService.chatRoomUserInsert(chatCountDTO);
        modelAndView.addObject("chatNumber", chatNumber);
        modelAndView.addObject("chatRoom", chatService.getChatRoom(chatNumber));
        return modelAndView;
    }

    @RequestMapping(value = "deleteChatUser")
    public String deleteChatUser(HttpServletRequest request, ChatRoomDTO chatRoomDTO, ChatCountDTO chatCountDTO) throws IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("chatNumber") != null) {
            deleteChatRoom(request, chatRoomDTO, chatCountDTO);
        }
        return "redirect:chat-rooms";
    }

    public void deleteChatRoom(HttpServletRequest request, ChatRoomDTO chatRoomDTO, ChatCountDTO chatCountDTO) {
        HttpSession session = request.getSession();
        int roomNumber = (int) session.getAttribute("chatNumber");
        String userId = (String) session.getAttribute("userId");
        chatRoomDTO.setMemberId(userId);
        chatCountDTO.setChatNumber(roomNumber);
        chatService.deleteChatUser(chatRoomDTO);
        if (chatService.getChatRoomUser(chatCountDTO) == null || chatService.getChatRoomUser(chatCountDTO) == 0) {
            chatService.deleteChatRoom(chatCountDTO);
        }
    }

}