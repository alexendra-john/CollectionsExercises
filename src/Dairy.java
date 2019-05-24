public class Dairy {
    private String[] products;

    public Dairy(String[] products) {
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public static void callDairyList(){
        String[] products={
                "Fermented milk",
                "Yogurt",
                "Cream",
                "Butter",
                "Cheese",
                "Casein",
                "Custard",
                "Ice cream"};


        for(String d: products){
            System.out.println(d);
        }
        System.out.println("Please enter an item and an amount:");
    }

}


