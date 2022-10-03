import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String next;
        do {
            Student st = new Student();
            st.inputStudent();

            studentList.add(st);

            do {
                System.out.print("Enter a next Student(Y/N)?: ");
                next = scanner.next().trim();
                next = next.toLowerCase();
            } while (!((next.equals("y")) || (next.equals("n"))));


        } while (next.equals("y"));

        for (Student student : studentList)
            student.printStudent();
    }
}
