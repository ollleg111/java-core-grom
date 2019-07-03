package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.Order;
import lesson35.model.Room;
import lesson35.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderDAO extends GeneralDAO<Order> {

    public OrderDAO() {
        super(Constants.ORDER_DB_PATH);
    }

    private UserDAO userDAO = new UserDAO();
    private RoomDAO roomDAO = new RoomDAO();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public Order mapping(String object) {


        String[] arr = object.split("([,][ ])");

        long id = Long.parseLong(arr[0]);
        User user = userDAO.findById(Long.parseLong(arr[1]));
        Room room = roomDAO.findById(Long.parseLong(arr[2]));

        Date dateFrom = null;
        try {
            dateFrom = simpleDateFormat.parse(arr[3]);
        } catch (ParseException e) {
            System.out.println("Wrong date format");
        }

        Date dateTo = null;
        try {
            dateTo = simpleDateFormat.parse(arr[4]);
        } catch (ParseException e) {
            System.out.println("Wrong date format");
        }

        double moneyPaid = Double.parseDouble(arr[4]);

        return new Order(id, user, room, dateFrom, dateTo, moneyPaid);
    }

    /*
    public Order(long id, User user, Room room, Date dateFrom, Date dateTo, double moneyPaid) {
    */
    @Override
    public String toFile(Order object) {
        return object.getId() + ", "
                + object.getUser().getId() + ", "
                + object.getRoom().getId() + ", "
                + object.getDateFrom() + ", "
                + object.getDateTo() + ", "
                + object.getMoneyPaid();
    }
}
