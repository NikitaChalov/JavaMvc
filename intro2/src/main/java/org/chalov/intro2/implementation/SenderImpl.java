package org.chalov.intro2.implementation;

import org.chalov.intro2.interfaces.Sender;
import org.chalov.intro2.interfaces.Receiver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class SenderImpl implements Sender {

    private final Receiver receiver;

    @Autowired
    public SenderImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String sendMessage(String message){
        return receiver.getMessage("Wired data transmission: " + message);
    }
}


