package lesson10.abstractorder;

import java.util.Date;

public class FurnitureOrder extends Order {

    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity,
                          int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureCode() {
        return furnitureCode;
    }

    @Override
    public void validateOrder() {
        String ownerName = getCustomerOwned().getName();
        if ((getShipFromCity() == "Киев" || getShipFromCity() == "Львов") && getBasePrice() >= 500 &&
                !ownerName.equalsIgnoreCase("Тест"))
            setDateConfirmed(new Date());
    }

    @Override
    public void calculatePrice() {
        double shippingCost;
        if (getBasePrice() > 5000)
            shippingCost = getBasePrice() * .02;
        else
            shippingCost = getBasePrice() * .05;
        setTotalPrice(getBasePrice() + shippingCost);
    }
}
