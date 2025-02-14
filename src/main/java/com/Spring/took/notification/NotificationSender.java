package com.Spring.took.notification;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<NotificationType> notificationTypes){
        for( NotificationType type : notificationTypes){
            if (type == NotificationType.SMS) {
                type.sendSmsNotification();
            }
            else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
            else if (type == NotificationType.WHATSAPP) {
                type.sendWhatApp();
            }
        }
    }
}
