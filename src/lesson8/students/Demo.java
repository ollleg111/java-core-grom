package lesson8.students;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.createLowestChild();
        demo.createHighestParent();

    }

    public SpecialStudent createLowestChild() {

        Student[] students = new Student[]{};
        Course course = new Course(new Date(), "Abdula", 25, "Marya Vasilievna", students);

        Course[] coursesTaken = new Course[]{};

        return new SpecialStudent("Dunkan", "Mac'Cloud", 55, coursesTaken, 222222, "wqqewqew@gmail.com");
    }

    public Student createHighestParent() {

        Course[] coursesTaken = new Course[]{};
        return new Student("Ivan", "Petrov", 66, coursesTaken);
    }
}
