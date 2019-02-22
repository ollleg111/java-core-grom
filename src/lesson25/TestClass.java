package lesson25;

public class TestClass <T, K, L> {

    public T doSomething1(T t){
        System.out.println("1");
        //logic1
        return t;
    }

    public K doSomething2(K k){
        System.out.println("2");
        //logic2
        return k;
    }

    public L doSomething3(L l){
        System.out.println("3");
        //logic3
        return l;
    }
}
