package org.chalov.intro2.Controllers;

import org.chalov.intro2.implementation.ReceiverImpl;
import org.chalov.intro2.implementation.SenderImpl;
import org.chalov.intro2.implementation.WirelessSenderImpl;
import org.chalov.intro2.interfaces.Receiver;
import org.chalov.intro2.interfaces.Sender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final Receiver receiver;
    private final Sender sender;

    public HomeController() {
        this.receiver = new ReceiverImpl();
        this.sender = new WirelessSenderImpl(this.receiver);
    }
    @RequestMapping(value= "/")
    public String home() {
        return sender.sendMessage("Hello world");
    }
}
