package com.zyziek055.spring_boot_basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("Sending sms notification: " + message);
    }
}
