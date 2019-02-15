package lesson10.abstractorder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ольга", "Днепр", "женский");
        Customer customer2 = new Customer("Анна", "Киев", "женский");
        Customer customer4 = new Customer("Сергей", "Харьков", "мужской");
        Customer customer3 = new Customer("Наташа", "Одесса", "женский");

        Order elOrder1 = new ElectronicsOrder("TV", new Date(), "Днепр",
                "Киев", 2000, customer1, 12);
        Order elOrder2 = new ElectronicsOrder("iPhone", new Date(), "Запорожье",
                "Киев", 50, customer4, 3);

        elOrder1.validateOrder();
        elOrder1.calculatePrice();
        ((ElectronicsOrder) elOrder1).getGuaranteeMonths();

        elOrder2.validateOrder();
        elOrder2.calculatePrice();
        ((ElectronicsOrder) elOrder2).getGuaranteeMonths();

        Order furnOrder1 = new FurnitureOrder("Выключатели", new Date(), "Киев",
                "Харьков", 6000, customer2, "b023274");
        Order furnOrder2 = new FurnitureOrder("Петли", new Date(), "Луганск",
                "Николаев", 3000, customer3, "d456755");

        furnOrder1.validateOrder();
        furnOrder1.calculatePrice();
        ((FurnitureOrder) furnOrder1).getFurnitureCode();
        furnOrder2.validateOrder();
        furnOrder2.calculatePrice();
        ((FurnitureOrder) furnOrder2).getFurnitureCode();


        System.out.println("tests 1");

        Customer cTest1 = new Customer("Ольга", "Киев", "женский");
        Customer cTest2 = new Customer("Ольга", "Львов", "женский");
        Customer cTest3 = new Customer("Ольга", "Днепр", "женский");
        Customer cTest4 = new Customer("Тест", "Днепр", "женский");
        Customer cTest5 = new Customer("Ольга", "Днепр", "женский");
        Order test1 = new FurnitureOrder("Выключатели", new Date(), "Киев",
                "Харьков", 6000, cTest1, "b023274");
        Order test2 = new FurnitureOrder("Выключатели", new Date(), "Киев",
                "Харьков", 6000, cTest2, "b023274");
        Order test3 = new FurnitureOrder("Выключатели", new Date(), "Киев",
                "Харьков", 6000, cTest3, "b023274");
        Order test4 = new FurnitureOrder("Выключатели", new Date(), "Киев",
                "Харьков", 6000, cTest4, "b023274");
        Order test5 = new FurnitureOrder("Выключатели", new Date(), "Киев",
                "Харьков", 5, cTest5, "b023274");

        test1.validateOrder();
        test2.validateOrder();
        test3.validateOrder();
        test4.validateOrder();
        test5.validateOrder();

        System.out.println("tests 2");

        Customer cTest6 = new Customer("Ольга", "Киев", "женский");
        Customer cTest7 = new Customer("Ольга", "Одесса", "женский");
        Customer cTest8 = new Customer("Ольга", "Днепр", "женский");
        Customer cTest9 = new Customer("Тест", "Харьков", "женский");
        Customer cTest10 = new Customer("Ольга", "Днепр", "мужской");
        Customer cTest11 = new Customer("Ольга", "Днепр", "мужской");

        Order test6 = new ElectronicsOrder("TV", new Date(), "Днепр",
                "Киев", 2000, cTest6, 12);
        Order test7 = new ElectronicsOrder("TV", new Date(), "Днепр",
                "Киев", 2000, cTest7, 12);
        Order test8 = new ElectronicsOrder("TV", new Date(), "Днепр",
                "Киев", 2000, cTest8, 12);
        Order test9 = new ElectronicsOrder("TV", new Date(), "Днепр",
                "Киев", 2000, cTest9, 12);
        Order test10 = new ElectronicsOrder("TV", new Date(), "Днепр",
                "Киев", 2000, cTest10, 12);
        Order test11 = new ElectronicsOrder("TV", new Date(), "Днепр",
                "Киев", 20, cTest11, 12);

        test6.validateOrder();
        test7.validateOrder();
        test8.validateOrder();
        test9.validateOrder();
        test10.validateOrder();
        test11.validateOrder();

    }
}
