package lesson27.hw1;

import lesson13.User;
import lesson13.UserRepository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        System.out.println(Arrays.toString(userRepository.getUsers()));

        User user = new User(1001, "Ann", "wlnnjlnljn");
        userRepository.save(user);

        System.out.println(Arrays.toString(userRepository.getUsers()));

        userRepository.save(user);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        //сохранение юзера +
        //сохранение того же юзера +
        //когда нет места в массиве +
        //когда сохраняют null +

        int n = 15;
        while (n > 0) {
            User user1 = new User(n, "Ann", "1lkmkmnknm");
            // userRepository.save(user1);
            System.out.println(userRepository.save(user1));
            n--;
        }
        System.out.println(Arrays.toString(userRepository.getUsers()));
        userRepository.save(null);

        //test update

        user = new User(1001, "Ann","deflkenfl");
        userRepository.update(user);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        //обновление юзера +
        //когда нет юзера на обновлении +
        //когда сохраняют null +

        user = new User(9999, "Ann","deflkenfl");
        userRepository.update(user);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        user = new User(9999, "Ann","deflkenfl");
        System.out.println(userRepository.update(user));

        System.out.println(userRepository.update(null));
        System.out.println(Arrays.toString(userRepository.getUsers()));
    }
}
