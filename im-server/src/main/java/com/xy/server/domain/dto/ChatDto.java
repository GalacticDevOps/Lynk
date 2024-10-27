package com.xy.server.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "会话对象")
public class ChatDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "会话id不能为空")
    @Schema(description = "会话id")
    private String chat_id;

    @Schema(description = "会话类型")
    private Integer chat_type;

    @Schema(description = "发送人")
    private String from_id;

    @Schema(description = "接收人")
    private String to_id;

    @Schema(description = "是否屏蔽")
    private Integer is_mute;

    @Schema(description = "是否置顶")
    private Integer is_top;

    @Schema(description = "时序")
    private Long sequence;

}