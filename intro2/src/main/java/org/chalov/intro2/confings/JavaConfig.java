package org.chalov.intro2.confings;

import org.chalov.intro2.implementation.ReceiverImpl;
import org.chalov.intro2.implementation.WirelessSenderImpl;
import org.chalov.intro2.interfaces.Receiver;
import org.chalov.intro2.interfaces.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean
    public Receiver receiver(){
        return new ReceiverImpl();
    }
    @Bean
    public Sender sender(@Autowired Receiver receiver){
        return new WirelessSenderImpl(receiver);
    }
}
