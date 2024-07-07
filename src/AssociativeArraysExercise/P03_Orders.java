package AssociativeArraysExercise;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Product> products = new LinkedHashMap<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("buy")) {
                break;
            }
            String[] tokens = input.split(" ");
            String productName = tokens[0];
            Double productPrice = Double.valueOf(tokens[1]);
            int productQuantity = Integer.parseInt(tokens[2]);

            if (!products.containsKey(productName)) {
                products.put(productName, new Product(productPrice, productQuantity));
            } else {
                Product product = products.get(productName);
                product.setPrice(productPrice);
                product.addQuantity(productQuantity);
            }

        }
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            String productName = entry.getKey();
            Product product = entry.getValue();
            double totalPrice = product.getPrice() * product.getQuantity();
            System.out.printf("%s -> %.2f%n", productName, totalPrice);
        }
    }

    static class Product {
        private double price;
        private int quantity;

        public Product(double price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void addQuantity(int quantity) {
            this.quantity += quantity;
        }
    }
}
