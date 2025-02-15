package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        boolean sortedByLastName = false;
        while (!sortedByLastName) {
            sortedByLastName = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getLastName().compareTo(list.get(i + 1).getLastName()) > 0) {
                    Student thisOne = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, thisOne);
                    sortedByLastName = false;
                } 
            }
        }

        boolean sortedByFirstName = false;
        while (!sortedByFirstName) {
            sortedByFirstName = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getLastName().equals(list.get(i + 1).getLastName())) {
                    if (list.get(i).getFirstName().compareTo(list.get(i + 1).getFirstName()) > 0) {
                        Student thisOne = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, thisOne);
                        sortedByFirstName = false;
                    } 
                }
            }
        }

        boolean sortedByGPA = false;
        while (!sortedByGPA) {
            sortedByGPA = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getLastName().equals(list.get(i + 1).getLastName())) {
                    if (list.get(i).getFirstName().equals(list.get(i + 1).getFirstName())) {
                        if (list.get(i).getGpa() < list.get(i + 1).getGpa()) {
                            Student thisOne = list.get(i);
                            list.set(i, list.get(i + 1));
                            list.set(i + 1, thisOne);
                            sortedByGPA = false;
                        }
                    } 
                }
            }
        }

        return list;
    }

}
