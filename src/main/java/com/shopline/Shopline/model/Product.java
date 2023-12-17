package com.shopline.Shopline.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

    @Entity

    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String name;

        private String description;

        private int price;

        private int stockQuantity;

        public Product() {
        }

        public Product(String name, String description, int price, int stockQuantity) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.stockQuantity = stockQuantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getStockQuantity() {
            return stockQuantity;
        }

        public void setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
        }
    }
