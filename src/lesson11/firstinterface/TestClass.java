package lesson11.firstinterface;

import lesson11.firstinterface.FirstInterface;

public class TestClass implements FirstInterface {

    private int test = 10;

    @Override
    public void send() {

    }

    @Override
    public String receive() {
        return null;
    }
}
