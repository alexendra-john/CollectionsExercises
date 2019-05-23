package grades;

import java.util.*;

/*
* Create a map for students and Github usernames

Create a class named GradesApplication with a main method. Inside the main method, create a
 * HashMap named students. It should have keys that are strings that represent github usernames,
 *  and values that are Student objects. Create at least 4 student objects with at least 3
 * grades each, and add them to the map.

Be creative! Make up github usernames and grades for your student objects.*/

public class Student {

    private String studentName;

    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    // returns the student's name
    public String getName() {
        return this.studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
       grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int numOfGrades = 0;
        for (int g : grades) {
            numOfGrades += g;
        }
        return numOfGrades / grades.size();
    }

    public static void main(String[] args) {
        Student john = new Student("John");
        Student alexendra = new Student("Alexendra");

        john.addGrade(80);
        john.addGrade(91);
        john.addGrade(50);
        alexendra.addGrade(69);

        System.out.println(john.getGradeAverage());
    }



}
