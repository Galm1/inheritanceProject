package com.company;

import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void transport(){
        throw new NoTransportException();
    }
}
