package com.zyziek055.spring_boot_basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${server-settings.host}")
    private String host;

    @Value("${server-settings.port}")
    private String port;

    @Override

    public void send(String message, String email){
        System.out.println("Recepient email: " + email);
        System.out.println("Sending email notification: " + message);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    }
}
