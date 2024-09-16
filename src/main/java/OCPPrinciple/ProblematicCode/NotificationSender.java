package OCPPrinciple.ProblematicCode;

import java.util.List;

public class NotificationSender {
    public  void sendNotification(List<NotificationType> notificationTypeList){
        for(NotificationType type:notificationTypeList){
            if(type==NotificationType.SMS){
                type.sendSMSNotification();
            }
            if(type==NotificationType.WHATSAPP){
                type.sendWhatsAppNotification();
            }
            if(type==NotificationType.EMAIL){
                type.sendEmailNotification();
            }
        }
    }
}
