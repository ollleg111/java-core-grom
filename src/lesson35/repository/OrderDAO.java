package lesson35.repository;

import lesson35.constants.Constant;
import lesson35.exceptions.InternalServerException;
import lesson35.model.Id;

public class OrderDAO extends DAO {

    @Override
    String path() {
        return Constant.ORDER_DB_PATH;
    }

    @Override
    Id mapToObject(String[] array) throws InternalServerException {

        throw new InternalServerException("!!!!");
    }

    public void bookRoom(long roomId, long userId, long hotelId) throws Exception{


    }

    public void cancelReserve(long roomId, long userId) throws Exception{


    }
}
