package org.chalov.intro2.implementation;

import org.chalov.intro2.interfaces.Sender;
import org.chalov.intro2.interfaces.Receiver;

public class SenderImpl implements Sender {
    private final Receiver receiver;

    public SenderImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String getMessage(String message) {
        return receiver.getMessage("Wired data transmission" + message);
    }
}
