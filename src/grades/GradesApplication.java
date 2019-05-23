package grades;

/*Create a map for students and Github usernames

 Create a class named GradesApplication with a main method. Inside the main method, create a
 HashMap named students. It should have keys that are strings that represent github usernames,
 and values that are Student objects. Create at least 4 student objects with at least 3 grades
 each, and add them to the map.

Be creative! Make up github usernames and grades for your student objects.
*/

//import java.util.HashMap;

import java.util.*;
//import java.util.Objects;
//import java.util.Arrays;

import static grades.NameGenerator.nameGenerator;

public class GradesApplication implements CommandLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<String, Student> userNames = new HashMap<>();


        for (int i = 0; i < 4; i++) {
            String key = "student" + i;
            String userName = nameGenerator();
            Student student = new Student(userName);
            int gNum = (int) (Math.random() * 100);
            student.addGrade(gNum);
            int gNum1 = (int) (Math.random() * 100);
            student.addGrade(gNum1);
            int gNum2 = (int) (Math.random() * 100);
            student.addGrade(gNum2);
            userNames.put(key, student);
        }

//      Start of part 3 of exercise. Loop through hashmap array and print out user names.

        for (String nameKey : userNames.keySet()) {
            System.out.println(userNames.get(nameKey).getName());
            //System.out.println(userNames.get(nameKey).getGradeAverage());
        }

//      Prompt user for a username to pull information from

        boolean exit = true;

        do {

            System.out.println("Which student they would like to see more information about?");
            String userName = input.nextLine();

            studentInfo(userName, userNames);


            System.out.println("Would you like to see another student?");
            String stringExit = input.nextLine();

            if (stringExit.equals("no")) {
                exit = false;
            }

        } while (exit);
        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static void studentInfo(String getName, HashMap<String, Student> users) {

        for (String nameKey : users.keySet()) {

            if (getName.equals(users.get(nameKey).getName())) {
                System.out.println(users.get(nameKey).getName());
                System.out.println(users.get(nameKey).getGrades());
                System.out.println(users.get(nameKey).getGradeAverage());
            }
        }
    }
}
