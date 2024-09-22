package school.management.system;
/*
* This class is responsible for keeping
* the track of students fees,name,grade,fees paid
* and fees total*
*
* */

public class Student {
    private int id;
    private String name;
    private int grade;
    private  int feesPaid;
    private  int feesTotal;
//    The role of constructor is to create new student object by initializing the values

    /**
     * Fees for every student is $30,000;
     * Fees paid initially is 0
     * @param id id for the student:unique
     * @param name  name of the student
     * @param grade grade of the student
     */
    public  Student(int id,String name,int grade){
        feesPaid=0;
        feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

//    we are not going to alter student's name,student's id.

    /**
     * used to update the student's grade
     * @param grade is the grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Add the fees to the fees paid
     * The school is going to receive the funds
     * @param fees fees that the students pays
     */
    public void payFees(int fees){
        feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * will return the id of the student
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * will return the name of the student
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * will return the grade of the student
     * @return
     */
    public int getGrade() {
        return grade;
    }

    /**
     * will return the fees paid by the student
     * @return
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * will return the total fees of the student
     * @return
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return remaining fees
     */
    public int getRemainingFees(){
        return  feesTotal -feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+" Total fees paid so far $"+ feesPaid;
    }
}
