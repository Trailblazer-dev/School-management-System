package school.management.system;

/**
 * This class is responsible for keeping the track
 * of teacher's name,id,salary
 */

public class Teacher {
    private int  id;
    private String name;
    private int salary;
private int salaryEarned;
    /**
     * Creates a new Teacher object
     * @param id id for the teacher
     * @param name name for the teacher
     * @param salary salary fo the teacher
     */
    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned=0;
    }

    /**
     * This wiil return the id of teacher
     * @return
     */

    public int getId(){
        return this.id;
    }

    /**
     * return the name of the teacher
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * return the salary of the teacher
     * @return
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to salary Earned;
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+name+ " Total salary earned is $"+salaryEarned;
    }
}

