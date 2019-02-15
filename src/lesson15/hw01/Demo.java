package lesson15.hw01;

import java.util.Arrays;

public class Demo {
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

        System.out.println(Arrays.toString(userRepository.getUsers()));

        User testUserOne = new User(21, "B", "ab");

        System.out.println(userRepository.findUser(testUserOne));
        System.out.println("   " + "find -    tested");
        System.out.println("");

        System.out.println(testUserOne.hashCode());
        userRepository.delete(25332);
        System.out.println(Arrays.toString(users));

        System.out.println("   " + "deleted - tested");
        System.out.println("");

        User[] usersOne = new User[]{
                new User(20, "A", "a"),
                new User(21, "B", "ab"),
                new User(22, "C", "abr"),
                new User(23, "D", "abra"),
                new User(24, "E", "abrac"),
                new User(25, "F", "abraca")
        };

        UserRepository userRepositoryOne = new UserRepository(usersOne);

        userRepositoryOne.update(testUserOne);
        System.out.println(Arrays.toString(usersOne));

        System.out.println("   " + "update  - tested");
        System.out.println("");

        User[] usersTwo = new User[]{
                new User(20, "A", "a"),
                new User(21, "B", "ab"),
                new User(22, "C", "abr"),
                null,
                new User(24, "E", "abrac"),
                new User(25, "F", "abraca")
        };

        UserRepository userRepositoryTwo = new UserRepository(usersTwo);

        System.out.println(Arrays.toString(usersTwo));
        System.out.println("");
        User testUserTwo = new User(23, "D", "abra");
        userRepositoryTwo.save(testUserTwo);
        System.out.println(Arrays.toString(usersTwo));

        System.out.println("");
        System.out.println("   " + "save    - tested");
    }
}
