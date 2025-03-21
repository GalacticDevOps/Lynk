package com.xy.imcore.enums;


/**
 * 好友关系的状态:1表示正常，0表示删除。可以为空，表示状态未知或未记录。
 * 拉黑标志:     1表示正常，0表示拉黑。可以为空，表示拉黑状态未知或未记录。
 * 阅读状态:     1表示已读，0表示未读。可以为空，表示阅读状态未知或未记录。
 * 审批状态:     1表示同意，0表示拒绝
 * 群组类型：    1表示私有群（类似微信），0表示公开群（类似QQ）
 * 全员禁言：    1表示不禁言，0表示全员禁言
 * 群组状态：    1表示正常，0表示解散
 */

public enum IMStatus {
    YES(1, "yes"),
    NO(0, "no");


    private int code;

    private String status;

    IMStatus(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
