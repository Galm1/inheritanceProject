package com.company;

public class EmailNotification extends Notification{

    private String recipient;
    private String smtpProvider;
    protected String status = "fine";

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void sayHi(String s) {
        System.out.println(s);
    }

    @Override
    protected void printSomeText(String s) {
        super.printSomeText(s);
        System.out.println("This is from the EmailNotification override");
    }

    @Override
    public void transport() {
        System.out.println(
                ", Subject - " + super.getSubject() +
                        ", Body - " + super.getBody() +
                        ", Created at - " + super.getCreatedAt() +
                        ", Recipient - " + getRecipient() +
                        ", Provider - " + getSmtpProvider() +
                        ", Status - " + super.getStatus()
        );
    }
}
