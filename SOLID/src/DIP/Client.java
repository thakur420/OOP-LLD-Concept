package DIP;

public class Client {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        NotificationService emailService  = new NotificationService(emailSender);
        NotificationService smsService = new NotificationService(smsSender);

        emailService.sentNotification("Hello via email");
        smsService.sentNotification("Hello via sms");
    }
}


