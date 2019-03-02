package lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetIntro {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("testStr");
        System.out.println(set);
        set.add("111");
        System.out.println(set);
        set.add("aaa");
        System.out.println(set);
        set.add("aaa");
        System.out.println(set);
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");

        System.out.println(set);

        Set<String> stringSet = new LinkedHashSet<>();

        stringSet.add("testStr");
        stringSet.add("111");
        stringSet.add("aaa");
        stringSet.add("bbb");
        stringSet.add("ccc");
        stringSet.add("ddd");
        stringSet.add("eee");

        System.out.println(stringSet);


        Set<File> files = new HashSet<>();
        File file1 = new File("pict.txt", 100);
        File file2 = new File("home.txt", 178);
        File file3 = new File("home.txt", 340);
        files.add(file1);
        files.add(file2);
        files.add(file3);

        System.out.println(files);
    }
}
