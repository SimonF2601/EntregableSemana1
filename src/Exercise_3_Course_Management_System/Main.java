package Exercise_3_Course_Management_System;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a global variable
        String option = "";
        GestionCourse objGestion = new GestionCourse();
        Student objStudent = new Student();

        //Create a menu
        do {
            option = JOptionPane.showInputDialog("""
                    Management System 💁‍♂️💁🏽‍
                    1. Student Manager
                    2. Course Manager
                    3. log off
                    """);

            switch (option) {
                case "1":
                    String optionStudent = "";
                    do {
                        optionStudent = JOptionPane.showInputDialog("""
                        Student Management Menu
                        1. Display list of students
                        2. adding a student
                        3. removing a student
                        4. log off
                        """);

                        switch (optionStudent){
                            case "1":
                                String code = JOptionPane.showInputDialog(null,objGestion.listCourse()+"\n\nEnter the course code of the course where the new student will be enrolled.");

                                Course objCourse = objGestion.searchByCode(code);

                                if (objCourse == null) {
                                    JOptionPane.showMessageDialog(null,"No course exists with this code","",JOptionPane.ERROR_MESSAGE);
                                }else{
                                    objCourse.listStudent();
                                }

                                break;
                            case "2":

                                code = JOptionPane.showInputDialog(null,objGestion.listCourse()+"\n\nEnter the course code of the course where the new student will be enrolled.");

                                objCourse = objGestion.searchByCode(code);

                                if (objCourse == null) {
                                    JOptionPane.showMessageDialog(null,"No course exists with this code","",JOptionPane.ERROR_MESSAGE);
                                }else{
                                    objCourse.addStudent();
                                }
                                break;
                            case "3":
                                code = JOptionPane.showInputDialog(null,objGestion.listCourse()+"\n\nEnter the code of the course where you want to delete the student:");
                                objCourse = objGestion.searchByCode(code);

                                if(objCourse == null){
                                    JOptionPane.showMessageDialog(null,"No course exists with this code","",JOptionPane.WARNING_MESSAGE);
                                }else{
                                    objCourse.deleteStudent();
                                }
                                break;
                            case "4":
                                JOptionPane.showMessageDialog(null,"exiting the Student menu","",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"ERROR\nInvalid option ✖️✖️","",JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    }while(!optionStudent.equals("4"));

                    break;
                case "2":
                    String optionCourse = "";
                    do {
                       optionCourse = JOptionPane.showInputDialog("""
                        Course Management Menu
                        1. Display list of course
                        2. adding a course
                        3. removing a course
                        4. Search by code
                        5. log off
                        """);

                       switch (optionCourse){
                           case "1":
                               JOptionPane.showMessageDialog(null,objGestion.listCourse());
                               break;
                           case "2":
                               objGestion.addCourse();
                               break;
                           case "3":
                                objGestion.removeCourse();
                               break;
                           case "4":
                               String code = JOptionPane.showInputDialog("Enter the course code to search for");
                               Course objCurso = objGestion.searchByCode(code);

                               if(objCurso == null){
                                   JOptionPane.showMessageDialog(null,"No code exists with this code","",JOptionPane.WARNING_MESSAGE);
                               }else{
                                   JOptionPane.showMessageDialog(null,objCurso.toString(),"",JOptionPane.WARNING_MESSAGE);
                               }
                               break;
                           case "5":
                               JOptionPane.showMessageDialog(null,"exiting the Course menu","",JOptionPane.INFORMATION_MESSAGE);
                               break;
                           default:
                               JOptionPane.showMessageDialog(null,"ERROR\nInvalid option ✖️✖️","",JOptionPane.ERROR_MESSAGE);
                               break;
                       }
                    }while(!optionCourse.equals("5"));

                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"exiting the system","",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"ERROR\nInvalid option ✖️✖️","",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (!option.equals("3"));


    }

}
