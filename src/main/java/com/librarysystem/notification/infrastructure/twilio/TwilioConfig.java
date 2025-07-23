package com.librarysystem.notification.infrastructure.twilio;

import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TwilioConfig {
    private final TwilioProperties properties;

    @PostConstruct
    public void init() {
        Twilio.init(properties.getAccountSid(), properties.getAuthToken());
    }
}
