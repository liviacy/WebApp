package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;


@Component
public class MessageService {

    private Logger log = LoggerFactory.getLogger(MessageService.class);

    private String message;

    public String getMessage() {
        log.debug("Message wird abgeholt...");
        return message;
    }

    public void setMessage(String message) {
        log.debug("Message wird ueberschrieben...");
        this.message = message;
    }



}
