package school.management.system;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1,"Lizzy",500);
        Teacher Caro = new Teacher(2,"Caro",1000);
        Teacher Kelvin = new Teacher(3,"Kelvin",1500);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Caro);
        teacherList.add(Kelvin);

        Student Brian = new Student(1,"Brian",4);
        Student Susan = new Student(2,"Susan",5);
        Student Elizabeth = new Student(3,"Elizabeth",2);
        Student Bornface = new Student(4,"Bornface",6);
        List<Student> studentList = new ArrayList<>();
        studentList.add(Bornface);
        studentList.add(Brian);
        studentList.add(Susan);
        studentList.add(Elizabeth);

        School Hub = new School(teacherList,studentList);

        System.out.println("totalMoney earned "+Hub.getTotalMoneyEarned());
    }
}