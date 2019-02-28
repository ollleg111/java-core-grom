package lesson28.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class DemoComparator {
    public static void main(String[] args) {

        Capability capability1 = new Capability(1001, "test", "rrrr", true, new Date());
        Capability capability2 = new Capability(1005, "test", "rrrr", false, new Date());
        Capability capability3 = new Capability(900, "test", "rrrr", true, new Date());
        Capability capability4 = new Capability(900, "test", "rrrr", false, new Date());

        ArrayList<Capability> capabilities = new ArrayList<>();

        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);

        System.out.println(capabilities.toString());

        capabilities.sort(new IsActiveComparator());

        System.out.println(capabilities.toString());


//        Comparator<Capability> comparator = new Comparator<Capability>() {
//            @Override
//            public int compare(Capability o1, Capability o2) {
//
//                // если поле channelName не равно - сравниваю по нему
//                // если равно - перехожу к fingerprint
//                // если fingerprint не равно - сравниваю по нему
//                // если равно - перехожу к dateCreated
//                // если dateCreated не равно - сравниваю по нему
//                // если равно - объекты равны
//
//                if (!o1.getChannelName().equals(o2))
//                    return o1.getChannelName().compareTo(o2.getChannelName());
//
//                //TODO
//
//                return 0;
//            }
//        };
    }

}
