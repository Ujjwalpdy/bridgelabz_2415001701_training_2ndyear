public class ShoppingCart {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "abc", "99"};
        int total = 0;

        for (String priceStr : prices) {
            try {
                int price = Integer.parseInt(priceStr); // Wrapper class usage
                total += price;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + priceStr);
            }
        }

        System.out.println("Total price: " + total);
    }
}