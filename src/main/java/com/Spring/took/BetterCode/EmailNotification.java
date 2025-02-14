package com.Spring.took.BetterCode;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Email notification");
    }
}
