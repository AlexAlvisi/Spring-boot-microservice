package com.project.microservices.CouponMicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class JsonResponseBody{
    @Getter
    @Setter
    private int server;
    @Getter @Setter
    private Object response;

    public JsonResponseBody() {
    }

    public JsonResponseBody(int server, Object response) {
        this.server = server;
        this.response = response;
    }

    public Object getResponse() {
        return response;
    }
}


