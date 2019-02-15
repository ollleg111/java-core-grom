package lesson8.ads;

import java.util.Date;

public class Ad extends BaseEntity{

    public int price;
    public Date dateCreated;

    public Ad(long id, int price) {
        super(id);
        this.price = price;
        this.dateCreated = new Date();
    }

    public void publishAd() {

    }
}
