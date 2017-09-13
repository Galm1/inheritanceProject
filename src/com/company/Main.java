package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmailNotification emailNotification = new EmailNotification("subject", "body", "recipient", "smtpProvider");
        TextNotification textNotification = new TextNotification("subject", "body", "recipient", "smsProvider");

        textNotification.transport();
        emailNotification.transport();
        Object emailNotificationClone = emailNotification.clone();


        if (emailNotificationClone.equals(emailNotification)){
            System.out.println("Your clone is equal");
        } else {
            System.out.println("Your clone is not equal");
        }

        emailNotification.sayHi("Hello! from email");
        textNotification.sayHi("Hello! from text");
        emailNotification.printSomeText("some text");

        
    }
}
