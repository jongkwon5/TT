![header](https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=header&text=Travel%20Together&fontSize=90)

![Animation](https://github.com/jongkwon5/TT/assets/137694287/89d277e0-a918-4be8-9790-0a06d1929184)

## <span style="color:lightblue; font-style: italic;">🎁 Team Project : Travel Together🎁 
1. 프로젝트명 : Travel Together(전국 지역 축제 소개 및 축제 동행 매칭 서비스)
2. 프로젝트 목표 : 축제 정보 제공 및 채팅과 게시판을 통해 여행 파트너를 찾을 수 있는 웹사이트 개발
3. 개발 인원 : 5명(팀 프로젝트)
4. 담당 역할 : 메인 페이지 / 채팅방 목록 & 실시간 채팅 풀스택 개발
5. 개발 기간 : 2023. 07. 25 ~ 2023. 09. 03. 

## <span style="color:lightblue; font-style: italic;">🗒️ 목차 🗒️
* [1. 개발 환경](#1-개발-환경)
  - [1-1 주요환경](#1-1-주요환경)    
  - [1-2 세부 기술 스택](#1-2-세부-기술-스택)    
  - [1-3 데이터베이스](#1-3-데이터베이스)   
  - [1-4 ETC](#1-4-etc)   
* [2. 프로젝트 소개](#2-프로젝트-소개)
* [3. 실행 화면](#3-실행-화면)
  - [3-1 메인](#3-실행-화면)
  - [3-2 채팅방 목록](#3-실행-화면)
  - [3-3 채팅방](#3-실행-화면)
* [4. DB 설계](#4-db-설계)
* [5. 마치며](#5-마치며)
  - [5-1 첫 팀 프로젝트](#5-마치며)
  - [5-2 Websocket](#5-마치며)
  - [5-3 보완해야 할 점](#5-마치며)

##  1. 개발 환경
### 1-1 주요환경
  + JAVA JDK 11.0.18
  + Eclipse 2019-12
  + Spring tool suite(STS) 3.9.13
  + Spring Framework 5.0.7
  + VS Code
### 1-2 세부 기술 스택
  + Spring
  + Java
  + JavaScript
  + HTML/CSS
  + MyBatis 3.3.1
### 1-3 데이터베이스
  + MySQL 8.0.21
### 1-4 ETC
  + Git/Github
  + Tomcat 8.5

## 2. 프로젝트 소개
+ 실시간 채팅 서비스 구현
  + Spring WebSocket 기술을 활용해 실시간 양방향 통신을 구현하여 사용자는 채팅을 통해 실시간으로 상호작용이 가능하며, 사용자 입/퇴장 실시간 알림, 귓속말, 비공개 방 생성 등 다양한 기능을 사용할 수 있습니다.
+ 웹 페이지 UI/UX 디자인 구현
  + HTML/CSS 및 JavaScript를 사용하여 메인 페이지 및 채팅방 목록 페이지를 구현하였습니다.
  + Swiper API를 활용하여 메인 페이지에 이미지 슬라이드쇼를 구현하여 시각적으로 다양한 환경을 구현하였습니다.
+ 채팅 비즈니스 로직 개발
  + 사용자 입/퇴장 실시간 알림, 귓속말, 비공개 방 생성 등의 채팅 비즈니스 로직을 구현하였습니다. 실시간으로 사용자가 입장하거나 퇴장할 때 알림을 제공하며, 사용자는 귓속말을 통해 다른 사용자에게 개인 메시지를 보낼 수 있으며, 공개/비공개 채팅방을 선택할 수 있습니다.
+ 데이터베이스 연동 및 관리
  + MyBatis를 활용하여 채팅방 목록 CRUD를 구현하였으며, MySQL DBMS를 통해 채팅방 정보를 저장 및 관리하였습니다
## 3. 실행 화면
   <details>
    <summary>메인(Click)</summary>   

  **1. 메인 페이지 (1/2)**
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/a0d0536e-3066-4659-814d-1ac1f7cbd391)
HTML/CSS/JavaScript(Swiper API)를 활용하여 메인 페이지의 UI/UX를 구현하였습니다.
     
  **2. 메인 페이지 (2/2)** 
 ![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/0a2f9f68-5f6c-44dc-936e-7db0aa37abb7)
HTML/CSS/JavaScript(Swiper API)를 활용하여 메인 페이지의 UI/UX를 구현하였습니다.  
     
  </details>
  <br/>   

  <details>
    <summary>채팅방 목록(Click)</summary>   

MyBatis를 활용해 채팅방 목록 CRUD 구현을 하였습니다. </br>사용자는 실시간으로 채팅방을 생성 및 참여할 수 있으며, 채팅방 생성과 동시에 사용자는 채팅방으로 접속하게 됩니다. 

**1. 채팅방 목록 페이지**
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/978f0c6b-83de-4b7d-97d5-150efaa68b84)
현재 DB에 저장된 채팅방이 없을 경우 보여지는 화면 입니다.  <br/>  
 **2. 채팅방 생성**  
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/de552a0f-3f44-4092-84ec-7a0fbc1c80db)
 <br/> 채팅방 생성 버튼 클릭시 채팅방 생성이 가능하며, form select 태그를 통해 지역 선택과 함께 제목 및 비밀번호를 설정하여 채팅방 생성이 가능합니다.  

**3. 채팅방 생성 후**    <br/> 
 ![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/49e8c5c2-9d56-44b2-a3b3-9327d7ef3236)
<br/> 채팅방 생성 완료 후, 생성자는 해당 채팅방으로 바로 접속하게 되며 위 페이지는 채팅방 목록 페이지에 접속중인 대기자에게 보여지는 화면입니다. 
  </details>
  <br/>   
    <details>
    <summary>채팅방(Click)</summary>   
     
Spring WebSocket을 사용하여 실시간 채팅 및 사용자 입/퇴장 알림, 채팅 내용 지우기, 귓속말 보내기 등의 기능을 사용할 수 있습니다. <br/>     <br/>    
**1. 채팅방(1/3)** <br/> 
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/d562da82-282c-48e7-9466-be6067497d14)
 <br/>  채팅방 첫 접속시 보여지는 화면입니다. 채팅방 상단에는 제목과 뒤로가기 버튼이 있으며, 우측에는 현재 참여 인원이 나타납니다.  
 
**2. 채팅방(2/3)** <br/> 
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/ae0d2a0b-a3f8-4fa3-ac3a-f17ecb27800d)
 <br/> 유저가 채팅방에 접속했을 경우 참여 인원이 실시간으로 업데이트 되고, 채팅방 본문에 해당 인원이 입장했다는 알림 문구가 나타나게 됩니다.<br/>
 자신의 채팅 내용은 우측, 상대방의 채팅 내용은 우측에 나타나며, 닉네임 및 발송 시간이 표시됩니다.
 
**3. 채팅방(3/3)**  <br/> 
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/27f90af6-2caf-4bd1-9f48-349eb5b5ec29)
<br/>  유저가 채팅방을 나갔을 경우 참여 인원이 실시간으로 업데이트 되고, 채팅방 본문에 해당 인원이 퇴장했다는 알림 문구가 나타나게 됩니다.<br/> 

**4. 채팅방 주요 기능(1/2)**  <br/> 
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/9ac5d399-d441-43f4-9f71-c413049bd2ae)<br/> <br/>
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/1d7dc37e-57d1-46f1-bb49-eface13c45bf)
<br/> /w + 상대방 닉네임 + 할말 문구를 통해 현재 채팅방에 접속 중인 특정 참가자에게 귓속말을 보낼 수 있으며 startsWith, split 메소드 등을 사용하여 해당 닉네임을 추출 후, DB와 연결하여 일치하는 사용자를 찾아내 귓속말을 발신합니다.

**5. 채팅방 주요 기능(2/2)**  <br/> 
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/1fa5c3cc-c512-4e7e-a997-8925b00d0a12)<br/><br/>
![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/6484aca0-423c-41ef-b7f3-c8046f81647a)<br/>
하단에 전체 내용 지우기 버튼을 통해 사용자 본인 화면에서의 모든 메시지를 삭제할 수 있습니다.<br/>
또한 해당 채팅방의 모든 인원이 퇴장하여 참여 인원이 0명이 될 경우, 해당 채팅방의 DB가 자동 삭제되도록 설계하였습니다. 
  </details>
  <br/>   

## 4. DB 설계
  ![image](https://github.com/jongkwon5/TravelTogether/assets/137694287/7a241dda-bade-4d1e-a9c3-377d2eb92430)

##  5. 마치며
### 5-1 첫 팀 프로젝트
  + 개인 프로젝트가 아닌, 처음으로 여러 명이 함께하는 팀 프로젝트를 진행하다 보니 많은 것이 서툴고 낯설었습니다. 
하지만 기획부터 시작해 USE-CASE 작성, ERD 작성 등 일련의 설계 단계를 통해 개발 전 필요한 아키텍처 설계 등의 
중요성을 알게 되었고, 또한 프로그래밍 네이밍 규칙 및 Github 배포 등 팀 협업에 필요한 기본적인 협업 프로세스를 
공부할 수 있었습니다.

### 5-2 Websocket
 + 이번 프로젝트에서 WebSocket을 활용하여 채팅방을 구현함으로써 기존 Request와 Response의 형태로 이루어진 
단방향 통신의 HTTP 통신과, 연결을 유지하면서 실시간으로 데이터를 전달할 수 있는 양방향 통신(WebSocket)에 대한
개념과 차이점을 이해할 수 있었습니다.

### 5-3 보완해야 할 점
+ 채팅 내용을 DB에 저장하여 채팅 내용이 반영구적으로 유지되는 메신저 형이 아닌, 페이지 전환이 발생하여 WebSocket
연결이 끊길 경우 채팅 내용이 사라지는 일회성의 채팅 프로그램이라는 점이 아쉽고, AWS와 같은 웹서버에 실제 배포까지
하지 못하고 Local 컴퓨터 환경에서만 테스트를 진행했다는 점 또한 개선해야 할 부분이라고 생각합니다.



※ 본 작업물은 개인 포트폴리오로 제작되어 어떠한 상업적 활동을 수행하지 않음을 명시합니다.
