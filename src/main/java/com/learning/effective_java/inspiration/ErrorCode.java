package com.learning.effective_java.inspiration;

/**
 * 用enum类型编写异常返回
 *
 * @author kian
 * @date 2019/6/14
 */
public enum ErrorCode {
    /**
     * 异常枚举
     */
    PARAMETER_ERROR(1100, "参数错误"),
    MONGO_ERROR(3100, "mongo 数据库异常");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public WebResponse errorResponse() {
        return new WebResponse(code, message);
    }

}

class WebResponse {
    private final int code;
    private final String message;
    private final Object data;

    WebResponse(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    @Override
    public String toString() {
        return "WebResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
