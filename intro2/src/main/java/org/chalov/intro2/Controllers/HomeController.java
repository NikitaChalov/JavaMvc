package org.chalov.intro2.Controllers;

import org.chalov.intro2.confings.JavaConfig;
import org.chalov.intro2.interfaces.Sender;
import org.chalov.intro2.implementation.WirelessSenderImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;

    @RequestMapping(value= "/")
    public String home() {
        context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Sender sender = context.getBean("WirelessSenderImpl", Sender.class);
        return sender.sendMessage(" Message from java config");
    }
}
