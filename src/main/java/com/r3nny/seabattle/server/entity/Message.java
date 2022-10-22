package com.r3nny.seabattle.server.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String from;
    private String text;
}
