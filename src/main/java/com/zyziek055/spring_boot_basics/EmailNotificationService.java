package com.zyziek055.spring_boot_basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("Sending email notification: " + message);
    }
}
