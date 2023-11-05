package com.traveltogether.biz.chat;

import java.util.List;

public interface ChatRoomService {
	
    void createChatRoom(ChatRoomDTO dto);

    List<ChatRoomDTO> getChatRoomList(ChatRoomDTO dto);

    void deleteChatUser(ChatRoomDTO dto);

    void chatRoomUserInsert(ChatCountDTO dto);

    List<ChatCountDTO> getNumberOfPeople(ChatCountDTO dto);

    Integer getChatRoomUser(ChatCountDTO dto);

    void deleteChatRoom(ChatCountDTO dto);

    ChatRoomDTO getChatRoom(int number);
    
}
