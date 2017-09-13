package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmailNotification emailNotification = new EmailNotification("subject", "body", "recipient", "smtpProvider");
        TextNotification textNotification = new TextNotification("subject", "body", "recipient", "smsProvider");

        textNotification.transport();
        emailNotification.transport();

        emailNotification.sayHi("Hello!");
        
    }
}
