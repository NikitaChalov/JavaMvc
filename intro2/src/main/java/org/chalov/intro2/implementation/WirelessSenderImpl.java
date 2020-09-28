package org.chalov.intro2.implementation;

import org.chalov.intro2.interfaces.Receiver;
import org.chalov.intro2.interfaces.Sender;

public class WirelessSenderImpl implements Sender {
    private final Receiver receiver;

    public WirelessSenderImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String getMessage(String message) {
        return receiver.getMessage("Wireless data transmission" + message);
    }
}
