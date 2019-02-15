package lesson8.phones;

import lesson8.phones.IPhone;

public class Demo {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone(110, 10.0, "Chins", true);
        iPhone.deleteIPhoneFromDb();
        iPhone.orderPhone();
    }
}
