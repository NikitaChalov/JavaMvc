package org.chalov.intro2.implementation;

import org.chalov.intro2.interfaces.Receiver;
import org.springframework.stereotype.Component;

@Component
public class ReceiverImpl implements Receiver {
    @Override
    public String getMessage(String message) {
        return message;
    }
}
