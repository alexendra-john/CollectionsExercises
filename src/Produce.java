public class Produce {

    private String[] produceList;

    public Produce(String[] produceList) {
        this.produceList = produceList;
    }

    public String[] getProduceList() {
        return produceList;
    }

    public void setProduceList(String[] produceList) {
        this.produceList = produceList;
    }

    public void callProduceList() {

        String[] produceList = {
                "Alfalfa sprouts",
                "Apples",
                "Apricots",
                "Artichokes",
                "Asparagus",
                "Avocados",
                "Bananas",
                "Beans",
                "Beets (Red)",
                "Beets (Golden)",
                "Bell peppers",
                "Blackberries",
                "Blueberries",
                "Bok Choy",
                "Broccoli",
                "Cantaloupe",
                "Carrots",
                "Cauliflower",
                "Celery",
                "Cherries",
                "Cucumbers",
                "Dates",
                "Eggplants",
                "Endives",
                "Fennel",
                "Figs",
                "Garlic",
                "Grapefruit",
                "Grapes",
                "Green beans",
                "Green onions",
                "Guava",
                "Honeydew melons",
                "Iceberg lettuce",
                "Kale",
                "Kiwis",
                "Kumquats",
                "Leeks",
                "Lemons",
                "Limes",
                "Lychee",
                "Mandarin oranges",
                "Mangos",
                "Mushrooms",
                "Nectarines",
                "Oranges",
                "Papayas",
                "Parsnips",
                "Peaches",
                "Pears",
                "Peas",
                "Pineapple",
                "Pomegranates",
                "Potatoes",
                "Pumpkin",
                "Quince",
                "Radishes",
                "Raspberries",
                "Rhubarb",
                "Romain lettuce",
                "Shallots",
                "Spinach",
                "Squash",
                "Tangerines",
                "Tomatoes",
                "Turnips",
                "Ugli fruit",
                "Water Chestnuts",
                "Watercress",
                "Watermelon",
                "Yams",
                "Yellow Squash",
                "Yuca/Cassava",
                "Zucchini Squash",
                "Waxed Beans"
        };

        for (String v: produceList) {
            System.out.println(v);
        }

        System.out.println("Please enter an item and an amount");

    }

}
