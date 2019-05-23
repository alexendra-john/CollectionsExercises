package grades;

public class CommandLine {

    public interface studentInfo {

        public String getGitUser (String getName);

        public String getStudentName (String studentName);

        public String getStudentAverage (double getGradeAverage);



    }

    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students: ");
        System.err.println(); //usernames from Array

    }


}
