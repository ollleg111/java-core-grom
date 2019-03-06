package lesson30.hw;


public class CustomerDAO extends GeneralDAO<Customer> {

    private static CustomerDAO instance;

    public static CustomerDAO getInstance(){
        if(instance == null){
            instance = new CustomerDAO();
        }
        return instance;
    }
}
