package lesson10.abstractorder;

import java.util.Date;

public class ElectronicsOrder extends Order {

    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice,
                            Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    public int getGuaranteeMonths() {
        return guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        String ownerGender = getCustomerOwned().getGender();
        if (citySearch(getShipFromCity()) && citySearch(getShipToCity()) && getBasePrice() >= 100 &&
                ownerGender.equalsIgnoreCase("женский"))
            setDateConfirmed(new Date());
    }

    private boolean citySearch(String cityName) {
        String[] city = new String[]{"Киев", "Одесса", "Днепр", "Харьков"};
        for (String str : city) {
            if (cityName == str)
                return true;
        }
        return false;
    }

    @Override
    public void calculatePrice() {
        double shippingCost;
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса")
            shippingCost = getBasePrice() * .1;
        else shippingCost = getBasePrice() * .15;

        double totalPrice = shippingCost + getBasePrice();
        if (totalPrice > 1000)
            totalPrice = totalPrice - totalPrice * .05;
        setTotalPrice(totalPrice);
    }
}
