package lesson35.repository;

import lesson35.constants.Constant;
import lesson35.exceptions.InternalServerException;
import lesson35.model.Id;
import lesson35.model.User;

public class UserDAO extends DAO{
    //считывние данных - с файла
    //обработка данных - маппинг данных

    @Override
    String path() {
        return Constant.USER_DB_PATH;
    }

    @Override
    Id mapToObject(String[] array) throws InternalServerException {

        throw new InternalServerException("!!!!");
    }

    public User registerUser(User user) {

        //save user to db (file)
        return user;
    }

}
