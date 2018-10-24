package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher lizzy      = new Teacher(1, "Lizzy", 500);
        Teacher melissa    = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(lizzy);
        teachersList.add(melissa);
        teachersList.add(vanderhorn);


        Student tamasha  = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi    = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teachersList, studentList);


        // adding another teacher
        Teacher megan = new Teacher(4, "Megan", 955);
        ghs.addTeachers(megan);

        // pay student fees
        tamasha.payFees(5000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        rakshith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());


        System.out.println("- - - -  Making school pay salary - - - -");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spend salary to " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spend salary to " + vanderhorn.getName() + " and now has $" + ghs.getTotalMoneyEarned());


        // output with overwriting toString Students:121
        System.out.println(rakshith);
        System.out.println(vanderhorn);

    }
}
