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

//        Student student0 = new Student("Sheafan the extra-large-platinum" );
//        int gNum = (int)(Math.random()*100);
//        student0.addGrade(gNum);
//        int gNum1 = (int)(Math.random()*100);
//        student0.addGrade(gNum1);
//        int gNum2 = (int)(Math.random()*100);
//        student0.addGrade(gNum2);
//        userNames.put("student0", student0);
//
//        Student student1 = new Student("Konnor the previous-criminal" );
//        int gNum = (int)(Math.random()*100);
//        student1.addGrade(gNum);
//        int gNum1 = (int)(Math.random()*100);
//        student1.addGrade(gNum1);
//        int gNum2 = (int)(Math.random()*100);
//        student1.addGrade(gNum2);
//        userNames.put("student1", student1);
//
//        Student student2 = new Student("J the symptomatic-criminal" );
//        int gNum = (int)(Math.random()*100);
//        student2.addGrade(gNum);
//        int gNum1 = (int)(Math.random()*100);
//        student2.addGrade(gNum1);
//        int gNum2 = (int)(Math.random()*100);
//        student2.addGrade(gNum2);
//        userNames.put("student2", student2);


        for (int i=0; i < 4; i++){
            String key = "student"+ i;
            String userName = nameGenerator();
            Student student = new Student(userName);
            int gNum = (int)(Math.random()*100);
            student.addGrade(gNum);
            int gNum1 = (int)(Math.random()*100);
            student.addGrade(gNum1);
            int gNum2 = (int)(Math.random()*100);
            student.addGrade(gNum2);
            userNames.put(key, student);
        }
//      Start of part 3 of exercise. Loop through hashmap array and print out user names.
        for (String nameKey: userNames.keySet() ){
            System.out.println(userNames.get(nameKey).getName());
            //System.out.println(userNames.get(nameKey).getGradeAverage());
        }
//      Prompt user for a username to pull information from
        System.out.println("Which student they would like to see more information about?");
        String userName = input.nextLine();
        //studentInfo(usrName,userNames );
//        for (String nameKey: userNames.keySet() ){
//
//            if (userName.equals(userNames.get(nameKey).getName())) {
//                System.out.println(userNames.get(nameKey).getName());
//                System.out.println(userNames.get(nameKey).getGrades());
//                System.out.println(userNames.get(nameKey).getGradeAverage());
//            }
//            //System.out.println(userNames.get(nameKey).getName());
//            //System.out.println(userNames.get(nameKey).getGradeAverage());
//        }

        studentInfo(userName, userNames);

    }

    //@Override
    public static void studentInfo(String getName,HashMap<String,Student> users ) {
//        int x = 0;
//            Student user = (Student)users.get(getName);
//            String userName = user.getName();
//           ArrayList gradesList= user.getGrades();
//            double gradeAverage = user.getGradeAverage();
//
//           for(Object grade: gradesList){
//               x++;
//               System.out.println("Grade # "+ x + " : "+ grade);
//           }
//
//        System.out.println(gradeAverage);
//        return null;
        for (String nameKey: users.keySet()){

            if (getName.equals(users.get(nameKey).getName())) {
                System.out.println(users.get(nameKey).getName());
                System.out.println(users.get(nameKey).getGrades());
                System.out.println(users.get(nameKey).getGradeAverage());
            }
            //System.out.println(userNameuserss.get(nameKey).getName());
            //System.out.println(userNames.get(nameKey).getGradeAverage());
        }
    }
}
