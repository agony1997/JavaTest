package org.example.mc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class McD {

    Map<String, Item> menu = new HashMap<>();

    public McD() {
        File file = new File("mc.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] split = line.split(",");
                Item item = new Item(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                menu.put(item.getId(), item);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println(("menu error"));
            throw new RuntimeException(e);
        }
    }

    public void printMenu() {
        for (Map.Entry<String, Item> entry : menu.entrySet()) {
            System.out.println(entry.toString());
        }
    }

    public static void main(String[] args) {
        McD mcD = new McD();
        mcD.printMenu();
    }

    class Item {
        String id;
        String name;
        int calorie;
        int price;

        public Item(String id, String name, int calorie, int price) {
            this.id = id;
            this.name = name;
            this.calorie = calorie;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", calorie=" + calorie +
                    ", price=" + price +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCalorie() {
            return calorie;
        }

        public void setCalorie(int calorie) {
            this.calorie = calorie;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }


}

