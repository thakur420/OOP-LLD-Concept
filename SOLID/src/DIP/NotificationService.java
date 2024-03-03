package DIP;

public class NotificationService {
    public final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sentNotification(String message){
        messageSender.sendMessage(message);
    }
}
