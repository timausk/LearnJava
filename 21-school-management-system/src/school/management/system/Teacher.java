package school.management.system;

/**
 * This class is responsible for keeping the track
 * of teachers id, name and the salary
 *
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * Creates a new teachers object.
     *
     * @param id     id for the teacher
     * @param name   name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {

        this.id     = id;
        this.name   = name;
        this.salary = salary;

        this.salaryEarned = 0;
    }

    /**
     * @return the name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the id of the teacher
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * set the teachers salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }


    /**
     *  Adds to the salary earned
     *  Removes from total money earned by the GHS school
     *
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpend(salary);
    }


    @Override
    public String toString() {
        return "Name of the teacher is " + name + ". The total salary earned so far is $" + salaryEarned;
    }
}
