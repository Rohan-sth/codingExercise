package day16;
import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StudentGrade {
    public static void main(String[] Args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 20, 85));
        students.add(new Student("Peter", 25, 92));
        students.add(new Student("Charlie", 21, 78));
        students.add(new Student("David", 19, 95));

        double averageGrade = averageGrade(students);
        System.out.println("Average grade: " + averageGrade);

        for (Student student : students) {
            if (student.getGrade() > 90) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }

    public static double averageGrade(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalGrade = 0.0;
        for (Student student : students) {
            totalGrade += student.getGrade();
        }
        return totalGrade / students.size();
    }

    }

