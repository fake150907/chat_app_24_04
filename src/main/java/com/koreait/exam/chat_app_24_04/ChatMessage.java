package com.koreait.exam.chat_app_24_04;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
@AllArgsConstructor
@Getter
public class ChatMessage<T> {
    private long id;
    private LocalDateTime createTime;
    private String authorName;
    private String content;

    public ChatMessage(String authorName, String content) {
        this(ChatMessageIdGenerator.getNextID(),LocalDateTime.now(),authorName,content);
    }
}

class ChatMessageIdGenerator{
    private static long id = 0;

    public static long getNextID(){
        return ++id;
    }
}