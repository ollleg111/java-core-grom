package lesson35.repository;

import lesson35.exceptions.InternalServerException;
import lesson35.model.Id;

public abstract class DAO<T extends Id> {

    abstract T mapToObject(String[] array) throws InternalServerException;

    abstract String path();


    public long genaratorId() {
        //TODO
        return 0;
    }

    public long findById(long id) {
        //TODO
        return 0;
    }

    public T add(T t) throws Exception {
        //TODO
        return null;
    }

    public void delete(long id) throws Exception {
        //TODO

    }


}
