package Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Aufruf {

    public static void main(String[] args)
    {
        List<Student> Student = new ArrayList<>();
        Student.add(new Student("Maximilian", 1810653613, 2018));
        Student.add(new Student("Bruce", 1810653799, 2019));
        Student.add(new Student("Herbert", 1234567890, 2345));

        for(Student a : Student)
        {
            System.out.println(a.toString());   //to String für eine saubere Ausgabe
        }
    }
}