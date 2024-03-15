package Exercise_3_Course_Management_System;

import javax.swing.*;
import java.util.ArrayList;

public class GestionCourse {
    //Attributes
    private ArrayList<Course> courseList;
    //Constructor
    public GestionCourse(){
        this.courseList = new ArrayList<>();
    }

    //As it is a controller class, all other parameters must be ordered from here.
    public void addCourse(){
        String name = JOptionPane.showInputDialog("Enter the name of the new course");
        String code = JOptionPane.showInputDialog("enter new course code");
        //Validate that the course code is unique
        if (this.searchByCode(code) != null){
            JOptionPane.showMessageDialog(null,"There is already a course with this code 😢");
            System.out.println("There is already a course with this code");
        }else {
            Course objCourse = new Course(code,name);
            if(this.courseList.add(objCourse)){
                JOptionPane.showMessageDialog(null,"Course successfully added");
                System.out.println("Course successfully added");
            }else {
                JOptionPane.showMessageDialog(null,"Course could not be added");
                System.out.println("Course could not be added");
            }
        }
    }
    public void removeCourse(){
        String idRemove = JOptionPane.showInputDialog(this.listCourse() + "\nEnter id of the student to delete");
        //
        boolean remove = this.courseList.removeIf(course -> course.getCode().equals(idRemove));

        System.out.println(remove
                ? "Student was eliminated correctly"
                : "Student could not be eliminated");

        if (remove){
            JOptionPane.showMessageDialog(null,"Student was eliminated correctly");
        }
    }
    public String listCourse(){
        if(this.courseList.isEmpty()){
            return "No courses registered";
        }
        String courses = "";
        for (Course iterable: this.courseList){
            courses += iterable.toString();
        }
        return courses;
    }
    public Course searchByCode(String searchCode ){
        for (Course iterable: this.courseList){
            if(iterable.getCode().equalsIgnoreCase(searchCode)){
            return iterable;
            };
        }
        return null;
    }
}


