package com.stopm.demo.pojo;

public class RequestMessage {

    private String sender;//消息发送者
    private String room;//房间号
    private String type;//消息类型
    private String content;//消息内容

    public RequestMessage() {
    }

    public RequestMessage(String sender, String room, String type, String content) {
        this.sender = sender;
        this.room = room;
        this.type = type;
        this.content = content;
    }


    /**
     * Gets the value of sender.
     *
     * @return the value of sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the sender.
     * You can use setSender() to set the value of sender
     *
     * @param sender sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Gets the value of room.
     *
     * @return the value of room
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the room.
     * You can use setRoom() to set the value of room
     *
     * @param room room
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * Gets the value of type.
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * You can use setType() to set the value of type
     *
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the value of content.
     *
     * @return the value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     * You can use setContent() to set the value of content
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }
}
