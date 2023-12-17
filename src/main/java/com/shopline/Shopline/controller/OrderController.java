package com.shopline.Shopline.controller;

import com.shopline.Shopline.dto.OrderDto;
import com.shopline.Shopline.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @PostMapping("")
    public Object CreateOrder (OrderDto orderDto){
        return orderService.CreateOrder(orderDto);
    }
    @GetMapping("")
    public Object GetAllProduct() {
        return orderService.GetAllOrder();
    }
    @GetMapping("/{id}")
    public Object GetProductById(@PathVariable Long id)
    {return orderService.GetOrderById(id);}
}
