public class BakedGoods {
    private String[] products;

    public BakedGoods(String[] products) {
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public static void callBakedList(){
        String[] products={
                "Biscuit ",
                "Bread",
                "Bagel ",
                "Bun",
                "Flatbread",
                "Muffibn",
                "Brownie",
                "Cake"
        };


        for(String d: products){
            System.out.println(d);
        }
        System.out.println("Please enter an item and an amount:");
    }

}
