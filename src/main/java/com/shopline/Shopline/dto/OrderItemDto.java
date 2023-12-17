package com.shopline.Shopline.dto;

import com.shopline.Shopline.model.Order;
import com.shopline.Shopline.model.Product;

public class OrderItemDto {
    private Long id;
    private Order order;

    private Product product;

    private int quantity;

    private Double subtotal;

    public OrderItemDto() {
    }

    public OrderItemDto(Long id, Order order, Product product, int quantity, Double subtotal) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                ", quantity=" + quantity +
                ", subtotal=" + subtotal +
                '}';
    }
}
