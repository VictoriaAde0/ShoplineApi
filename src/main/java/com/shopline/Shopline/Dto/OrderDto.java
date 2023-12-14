package com.shopline.Shopline.Dto;

public class OrderDto {
    private double totalAmount;

    private String orderItems;

    public OrderDto(double totalAmount, String orderItems) {
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(String orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "totalAmount=" + totalAmount +
                ", orderItems='" + orderItems + '\'' +
                '}';
    }
}

