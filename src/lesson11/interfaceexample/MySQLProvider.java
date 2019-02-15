package lesson11.interfaceexample;

public class MySQLProvider implements DbProvider/*, Comparable*/ {

    @Override
    public void connectToDb() {
        //some logic for mysql
    }

    @Override
    public void disconnectFromDb() {
        //some logic for mysql
    }

    @Override
    public void encryptData() {
        //some logic for mysql
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
