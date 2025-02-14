package com.Spring.took.notification;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP ;

    public void sendSmsNotification(){
        System.out.println("Sending SMS");
    }
    public void sendEmailNotification(){
        System.out.println("Sending Email");
    }
    public void sendWhatApp(){
        System.out.println("sending Whatapp");
    }
}
