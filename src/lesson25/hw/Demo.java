package lesson25.hw;

import lesson24.exercise.GeneralDAO;
import lesson24.exercise.Order;
import lesson24.exercise.Sys;
import lesson24.exercise.Tool;

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

        integerGeneralDAO.save(i);
        doubleGeneralDAO.save(b);
        stringGeneralDAO.save(abc);

        integerGeneralDAO.save(a);
        doubleGeneralDAO.save(z);

        System.out.println(Arrays.toString(integerGeneralDAO.getAll()));
        System.out.println(Arrays.toString(doubleGeneralDAO.getAll()));
        System.out.println(Arrays.toString(stringGeneralDAO.getAll()));

    }
}
