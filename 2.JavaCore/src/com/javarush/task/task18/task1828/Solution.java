package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {

    public static class Product {
        int id;
        private String name;
        private String price;
        private String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static Product productParse(String str) {
        int id = Integer.parseInt(str.substring(0, 8).trim());
        String name = str.substring(8, 38).trim();
        String price = str.substring(38, 46).trim();
        String quantity = str.substring(46, 50).trim();
        return new Product(id, name, price, quantity);
    }

    public static void main(String[] args) {

        if (args.length == 0) return;

        ArrayList<Product> productArrayList = new ArrayList<>();
        String fileName = null;
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = fileNameReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.ready()) {
                productArrayList.add(productParse(bufferedReader.readLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (args[0]) {
            case "-u": {
                int id = Integer.parseInt(args[1]);
                String name = "";
                for (int i = 2; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product productToUpdate = null;
                for (Product product : productArrayList) {
                    if (product.id == id) productToUpdate = product;
                }
                if (productToUpdate != null) {
                    productToUpdate.name = name;
                    productToUpdate.price = price;
                    productToUpdate.quantity = quantity;
                }
                break;
            }

            case "-d": {
                int id = Integer.parseInt(args[1]);
                Product productToDelete = null;
                for (Product product : productArrayList) {
                    if (product.getId() == id) productToDelete = product;
                }
                if (productToDelete != null) productArrayList.remove(productToDelete);
                break;
            }

        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            for (Product product : productArrayList) {
                bufferedWriter.write(product.toString());
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
