package com.librarysystem.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class Notification {
//    private final String recipient;
//    private final String subject;
    private final String message;
}
