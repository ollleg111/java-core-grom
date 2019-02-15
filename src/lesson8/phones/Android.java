package lesson8.phones;

public class Android extends Phone {
//    int price;
//    double weight;
//    String countryProduce;

    String androidVersion;
    int screenSize;

    String secretDeviceCode;

    public Android(int price, double weight, String countryProduce, String androidVersion, int screenSize, String secretDeviceCode) {
        super(price, weight, countryProduce);

//        this.price = price;
//        this.weight = weight;
//        this.countryProduce = countryProduce;

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

//    void orderPhone() {
//
//    }

    void installNewAndroidVersion() {
        System.out.println("installNewAndroidVersion invoked...");
    }
}
