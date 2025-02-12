package com.xy.server.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ChatVo<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private String chatId;
    private Integer chatType;
    private String ownerId;
    private String toId;
    private Integer isMute;
    private Integer isTop;
    private Long sequence;
    private String name;
    private String avatar;
    private Integer unread;
    private String id; // groupId or userId
    private Object message;
    private String messageContentType;
    private Long messageTime;

}
