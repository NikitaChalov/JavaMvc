package org.chalov.intro2.implementation;

import org.chalov.intro2.interfaces.Receiver;
import org.chalov.intro2.interfaces.Sender;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class WirelessSenderImpl implements Sender {
    private final Receiver receiver;

    @Autowired
    public WirelessSenderImpl (Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wireless data transmission" + message);
    }
}
