package Exercise_3_Course_Management_System;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    //Attributes
    private String code;
    private String name;
    private ArrayList<Student> studentList;
    //Un
    static int index = 1;

    //Constructor
    public Course(){

    }

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.studentList = new ArrayList<>();
    }
    //Methods
    public void addStudent (){

        String id = JOptionPane.showInputDialog("Enter the new student's ID");
        String name = JOptionPane.showInputDialog("Enter the new student's name");
        String email = JOptionPane.showInputDialog("Enter the new student's email");
        Student objStudent = new Student(id,name,email);
        this.studentList.add(objStudent);

        System.out.println("Student successfully added 😊");

    }

    public String listStudent(){
        if(this.studentList.isEmpty()){
            return "There are no students in the ".concat(this.name).concat(" course");
        }
        System.out.println("list of students in the course of ".concat(this.name));
        String text = "";
        for(Student iterable: this.studentList){
            text += iterable.toString();
        }
        return text;

    }

    public void  deleteStudent(){
       ;

        String idEliminar = JOptionPane.showInputDialog(this.listStudent() + "\nEnter id of the student to delete");
        //
        boolean eliminado = this.studentList.removeIf(student -> student.getId().equals(idEliminar));

        System.out.println(eliminado
                ? "Student was eliminated correctly"
                : "Student could not be eliminated");

        if (eliminado){
            JOptionPane.showMessageDialog(null,"Student was eliminated correctly");
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", studentList=" + studentList +
                "}\n";
    }
    //Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
