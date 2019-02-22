package lesson25.hw;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        GeneralDAO<Integer> integerGeneralDAO = new GeneralDAO<>();
        GeneralDAO<Double> doubleGeneralDAO = new GeneralDAO<>();
        GeneralDAO<String> stringGeneralDAO = new GeneralDAO<>();

        int i = 100;
        double b = 2.5;
        String abc = "aaa";

        Integer a = 23;
        Double z = 24.6d;

        try {
            integerGeneralDAO.save(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            doubleGeneralDAO.save(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            stringGeneralDAO.save(abc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            integerGeneralDAO.save(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            doubleGeneralDAO.save(z);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(integerGeneralDAO.getAll()));
        System.out.println(Arrays.toString(doubleGeneralDAO.getAll()));
        System.out.println(Arrays.toString(stringGeneralDAO.getAll()));

    }
}
