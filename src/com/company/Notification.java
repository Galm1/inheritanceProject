package com.company;

import java.time.LocalDateTime;

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "fine";

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

    public String getStatus() {
        return status;
    }

    public void showStatus(){
        System.out.println(status);
    }

    public abstract void transport() throws NoTransportException;

}
