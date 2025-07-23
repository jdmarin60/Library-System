package com.librarysystem.notification.infrastructure.twilio;

import com.librarysystem.notification.domain.Notification;
import com.librarysystem.notification.domain.NotificationService;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwilioNotificationService implements NotificationService {
    private final TwilioProperties properties;

    @Override
    public void send(Notification notification) {
        Message.creator(
                new PhoneNumber(properties.getPhoneNumber()),
                new PhoneNumber(properties.getPhoneNumber()),
                notification.getMessage()
        ).create();
    }
}
