package lesson9;

import java.util.Arrays;

public class Demo{

}

class EmployeeController {

    public static void main(String[] args) {

        User[] users = new User[]{
                new User(20, "A", "a"),
                new User(21, "B", "ab"),
                new User(22, "C", "abr"),
                new User(23, "D", "abra"),
                new User(24, "E", "abrac"),
                new User(25, "F", "abraca")
        };

        UserRepository userRepository = new UserRepository(users);
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUserIds()));
        System.out.println(userRepository.getUserNameById(23));
    }
}