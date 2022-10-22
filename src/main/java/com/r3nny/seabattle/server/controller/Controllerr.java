package com.r3nny.seabattle.server.controller;

import com.r3nny.seabattle.server.entity.Message;
import com.r3nny.seabattle.server.entity.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Controllerr {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(final Message message) throws Exception {
        System.out.println(message.getFrom() + " " + message.getText());
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }

}
