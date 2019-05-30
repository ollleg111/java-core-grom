package lesson24.test;

public class Demo {


    public static void main(String[] args) {

        GeneralDAO<Client> clientGeneralDAO = new GeneralDAO<>();
        Client client = new Client(30, "asd");

        clientGeneralDAO.print(client);

        Ord ord = new Ord(1, "kkk");


        GeneralDAO<Ord> ordGeneralDAO = new GeneralDAO<>();

        ordGeneralDAO.print(ord);


    }
}
