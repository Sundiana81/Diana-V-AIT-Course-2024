package homework_19;

public class MarketAppl {

    public static void main(String[] args) {

        Product[] products = new Product[3];
        products[0] = new MeatFood(35.7, "Fisch", 8473639L, "24-10-24", "Fisch");
        products[1] = new MilkFood(3.0, "Milk", 8373637281L, "24-10-24", "Zige", 3.5);
        products[2] = new Food(1.0, "Bread", 5748395L, "31-12-24");

        printAllProducts(products);
        double totalPrice = calculateTotalPrice(products);
        System.out.println("Total price of all products: " + totalPrice);
    }


    public static void printAllProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }


    public static double calculateTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}