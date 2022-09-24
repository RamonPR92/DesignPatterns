package patterns.singleton;

public class ChatRoom {

    private static ChatRoom chatRoom;

    private ChatRoom(){};

    public static ChatRoom getInstance(){
        if(chatRoom == null)
            chatRoom = new ChatRoom();
        return chatRoom;
    }
}
