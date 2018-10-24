package school.management.system;

// what we need, how could an (student) object look like
/**
 * This class is responsible for keeping the track
 * of students fees, name, id, grade
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // ask yourself, what is always required

    /**
     * To create a new student object by
     * initializing the values
     *
     * Fees for every student is $30,000
     * Fees paid initially is 0
     *
     * @param id    id for the student: unique.
     * @param name  name of the student.
     * @param grade grade of student.
     */
    public Student(int id, String name, int grade) {
        // validate the values
        //if()

        // default values, we don't have to pass
        this.feesPaid = 0;
        this.feesTotal = 30000;

        // different for each student
        this.id    = id;
        this.name  = name;
        this.grade = grade;

    }


    // are we not going to alter student's name, id.
    // so is a set method required? NO
    // what we are going to alter student grade? yes

    /**
     * Used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of a student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Keep adding the fees to feesPaid field/property.
     * The school is going to recieve the funds
     *
     * @param fees fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;

        // money earned by school, to update we made it static (School class)
        School.updateTotalMoneyEarned(feesPaid);
    }


    /**
     *
     * @return the remaining fees a student have to pay.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }


    @Override
    public String toString() {
        return "Student's name : " + name + " total fees paid so far $" + feesPaid;
    }

}
