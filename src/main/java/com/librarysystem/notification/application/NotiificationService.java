package com.librarysystem.notification.application;

import com.librarysystem.notification.domain.Notification;
import com.librarysystem.notification.domain.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotiificationService {
    private final NotificationService notificationService;

    public void notifyUser(String content) {
        Notification notification = new Notification(content);
        notificationService.send(notification);
    }
}
