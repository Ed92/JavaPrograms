package school.management.system;

/**
 * Created by Erik Djamgarian
 * This class is repsonsible for keeping
 * track of students
 *
 */


public class Student {

     private int id;
     private String name;
     private int grade;
     private int feesPaid;
     private int feesTotal;


    /**
     * Create a new Student by initializing.
     * @param id id for the studen: unique.
     * @param name of the student.
     * @param grade of the student.
     */


    public Student(int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
     }




     public void setGrade(int grade) {
        this.grade = grade;
     }

    /**
     * keep adding the fees to feesPaid
     * @param fees that the student pays
     */

    public void updateFeesPaid(int fees){
        feesPaid += fees;
    }


}

