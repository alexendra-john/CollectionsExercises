import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<String>();
        Scanner sc = new Scanner (System.in);

        //String itemAdd = sc.next();
        //String userCont = sc.next();
        //int itemCount = sc.nextInt();
        System.out.println("Would you like to create a grocery list?");
        String response = sc.nextLine();

        groceryLoop(response,sc,grocery);

        Collections.sort(grocery);

        for(String str: grocery){
            System.out.println(str);
        }

    }

    public static void groceryLoop(String response, Scanner sc, ArrayList<String> grocery){
        if (response.equals("yes")) {
            //System.out.println("debug "+response);
            System.out.println("Please choose a category: \n " +
                    "1. Produce \n 2. Dairy\n 3. Baked Goods\n");
            String catProd = (sc.nextLine()).toLowerCase();
            System.out.println("debug "+response);
            switch (catProd){
                case "produce":
                    Produce.callProduceList();
                    break;
                case "dairy":
                    Dairy.callDairyList();
                    break;
                case "baked goods":
                    BakedGoods.callBakedList();
                    break;
                default:
                    System.out.println("Please select a valid category by name.");

            }
           // System.out.println("debug "+response);
            String prod = sc.next();
            String amount = sc.next();
            //System.out.printf("%s %s",prod,amount);
            grocery.add("Product: "+ prod+ "\n Amount: "+ amount);
            for(String str: grocery){
                System.out.println(str);
            }
            System.out.println("Would you like to continue?");
            sc.nextLine();
            response = sc.nextLine();
            //System.out.println(response);
            if(response.equals("yes")) {
                System.out.println(response);
                groceryLoop(response,sc,grocery);
            }

        }
    }
}
