package com.Spring.took.BetterCode;

public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("sending Sms notification");
    }
}
