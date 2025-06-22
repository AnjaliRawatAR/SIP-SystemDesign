package S.O;

public class InvoiceClient {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Invoice i = new Invoice(pen);
        System.out.println(i.CreateInvoice());
        SendNotification sn = new Gmail_Notification();
        SendNotification sn1 = new SMS_Notification();
        System.out.println(((Gmail_Notification)sn).x);
        sn.Send_Notification(i);
//        i.SendMail();
//        i.print();
//        SendNotification sn = new SendNotification(i);
    }
}
