package org.chalov.intro2.Controllers;

import org.chalov.intro2.implementation.ReceiverImpl;
import org.chalov.intro2.implementation.SenderImpl;
import org.chalov.intro2.implementation.WirelessSenderImpl;
import org.chalov.intro2.interfaces.Receiver;
import org.chalov.intro2.interfaces.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private org.springframework.web.context.WebApplicationContext context;

    @RequestMapping(value= "/")
    public String home() {
        Sender sender = context.getBean("sender", Sender.class);
        return sender.sendMessage("My message");
    }
}
