import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<String>();
        Scanner sc = new Scanner (System.in);

        String itemAdd = sc.next();
        String userCont = sc.next();
        int itemCount = sc.nextInt();
        System.out.println("Would you like to create a grocery list?");
        String response = sc.nextLine();
        if (response.equals("yes")) {

            do {
                System.out.println("Please choose a category: \n " +
                        "1. Produce \n 2. Dairy\n 3. Baked Goods\n");
                response = (sc.nextLine()).toLowerCase();

                switch (response){
                    case "produce":
                        //todo method for produce
                        break;
                    case "dairy":
                        //todo dairy method
                        break;
                    case "baked goods":
                        //todo baked method
                        break;
                        default:
                            System.out.println("Please select a valid category by name.");

                }
                System.out.println("Would you like to continue?");
                response = sc.nextLine();

            } while (response.equals("yes"));
        }

    }
}
