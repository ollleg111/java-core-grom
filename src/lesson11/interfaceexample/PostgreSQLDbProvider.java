package lesson11.interfaceexample;

public class PostgreSQLDbProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic for post
    }

    @Override
    public void disconnectFromDb() {
        //some logic for post
    }

    @Override
    public void encryptData() {
        //some logic for post
    }
}
