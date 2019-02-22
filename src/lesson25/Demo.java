package lesson25;

public class Demo {
    public static void main(String[] args) throws Exception {

        GeneralDAO generalDAO = new GeneralDAO();

        Order order = new Order(1);
        generalDAO.validate(order);

        TestClass<String, Order, Long> testClass = new TestClass<>();
        System.out.println(testClass.doSomething1("rrr"));

        long var1 = 111;
        Long var2 = new Long(111);

        int test =100;

        generalDAO.validate(var2);
        generalDAO.validate(var1);

        generalDAO.validate(test);
    }
}
