package school.management.system;

import java.util.List;

/**
 * The school can have many teachers, many students.
 * Implements teachers and students using an ArrayList.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;


    /**
     * new school object is created.
     *
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;

        this.totalMoneyEarned = 0;
        this.totalMoneyEarned = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher which was added
     */
    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student which was added
     */
    public void addStudents(Student student) {
        this.students.add(student);
    }

    /**
     *
     * @return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * the total money the school earned
     * @param moneyEarned
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spend by the school
     */
    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    /**
     * Update the total money spend by the school
     * which is the salary given by the school to its teachers
     * @param moneySpend the money spend by the school
     */
    public static void updateTotalMoneySpend(int moneySpend) {
        totalMoneyEarned -= moneySpend;
    }
}
