package lesson8.phones;

public class IPhone extends Phone {
//    int price;
//    double weight;
//    String countryProduce;

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduce, boolean fingerPrint) {
        super(price, weight, countryProduce);

        System.out.println("IPhone constructor was invoked...");

//        this.price = price;
//        this.weight = weight;
//        this.countryProduce = countryProduce;

        this.fingerPrint = fingerPrint;
    }

//    void orderPhone() {
//
//    }

    void deleteIPhoneFromDb() {
        System.out.println("deleteIPhoneFromDb invoked...");
    }
}
