package lesson23;

public class Validator {

    private String name;
    private final static int checkCount = 7;

    public Validator(String name/*, int checkCount*/) {
        this.name = name;
        //this.checkCount = checkCount;
    }

    public String getName() {
        return name;
    }

    public int getCheckCount() {
        return checkCount;
    }


    public final boolean validate(){
        //
        // -1-
        //
        return false;
    }
}
