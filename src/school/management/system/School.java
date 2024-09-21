package school.management.system;

import java.util.List;

/**
 * The school can have many teachers,students
 * we can't use array since are fixed and the number of teacher and students
 * keeps on varying
 * we can use ArrayList
 */
public class School {
    private List<Teacher> teachers;
    private  List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     * will return the list of teacher in the school
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * will add a  teachers to the school
     * @param teacher the teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * will return the total money spent by the school
     * @return
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * will update the money money spent by the school(which is the money used to pay the teachers)
     * @param moneySpent  add the money spent by the school
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -=moneySpent;
    }

    /**
     * will return the total money earned by the school
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * will update/add the total money earned by the school
     * @param MoneyEarned the money earned by the school
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += totalMoneyEarned;
    }

    /**
     * will return a list of students in the school
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * will add a new student to the list of the students in the school
     * @param student student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }
}
