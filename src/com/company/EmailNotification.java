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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        if (smtpProvider != null ? !smtpProvider.equals(that.smtpProvider) : that.smtpProvider != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() {
        return new EmailNotification("this is a clone", "here is a clone fore the body", "recipient clone", "annnnnd cloning the provider");
    }
}
