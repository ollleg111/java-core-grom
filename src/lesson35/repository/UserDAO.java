package lesson35.repository;

import lesson35.model.User;

public class UserDAO extends DAO{
    //считывние данных - с файла
    //обработка данных - маппинг данных

    public User registerUser(User user) {

        //save user to db (file)
        return user;
    }

}