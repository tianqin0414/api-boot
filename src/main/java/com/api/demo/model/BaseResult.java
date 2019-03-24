package com.api.demo.model;

import java.io.Serializable;

public class BaseResult  implements Serializable {
    private String code="0";
    private String message="成功";

    public <R extends BaseResult> R setError(String code, String message) {
        this.code = code;
        this.message = message;
        return (R) this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
