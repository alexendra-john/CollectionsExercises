package grades;
import java.util.*;
/*
* Create the command line interface

Print  the list of github usernames out to the console, and ask the user which student they would
like to see more information about. The user should enter a github username (i.e. one of the
keys in your map). If the given input does not match up with a key in your map, tell the user
that no users with that username were found. If the given username does exist, display
information about that student, including their name and their grades.

After the information is displayed, the application should ask the user if they want to
continue, and keep running so long as the answer is yes.
* */
public interface CommandLine {

    public static String studentInfo(String userName){return "";};

    public static String getGitUser (String getName){return "";};

    public static String getStudentName (String studentName){return "";};

    public static String getStudentAverage (double getGradeAverage){return "";};




    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students: ");
        System.err.println(); //usernames from Array

    }


}
