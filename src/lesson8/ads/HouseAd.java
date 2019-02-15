package lesson8.ads;

public class HouseAd extends Ad {

    public String ownerName;
    public String adress;
    public double square;
    public int floors;

    public HouseAd(long id, int price, String ownerName, String adress, double square, int floors) {
        super(id, price);
        this.ownerName = ownerName;
        this.adress = adress;
        this.square = square;
        this.floors = floors;
    }

    public HouseAd(long id, int price) {
        super(id, price);
    }

    public boolean checkOwner() {
        Owners owners = new Owners();

        for (String owner : owners.owners) {
            if (ownerName == owner)
                return true;
        }
        return false;
    }
}
