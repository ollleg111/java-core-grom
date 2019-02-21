package lesson24.firstexample;

public class Demo <T>{

//    private void printUser(User  user){
//        //print
//    }

//   private void printSolution(Solution  solution){
//        //print
//    }

//   private void printChanel(Chanel  chanel){
//        //print
//    }


   public void print(T  t){
       System.out.println(t);
    }


//    private static void calculatePrice(FirstOrder firstOrder) {
//        Sys.out.println(firstOrder.getPrice());
//    }

//    private static void calculatePrice(SecondOrder secondOrder) {
//        Sys.out.println(secondOrder.getPrice());
//    }

    private static void calculatePrice(AbstractOrder abstractOrder) {
        System.out.println(abstractOrder.getPrice());

    }

    public static void main(String[] args) {

        calculatePrice(new FirstOrder());
        calculatePrice(new SecondOrder());
    }

}
