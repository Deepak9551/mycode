package com.Spring.took.BetterCode;

public class WhatAppNotification implements Notification{
    @Override
    public void send() {
        System.out.println("sending WhatAPP notification");
    }
}
