package com.shopline.Shopline.Controller;

import com.shopline.Shopline.Dto.OrderDto;
import com.shopline.Shopline.Service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @PostMapping("/create")
    public Object CreateOrder (OrderDto orderDto){
        return orderService.CreateOrder(orderDto);
    }

    public Object GetAllProduct() {return orderService.GetAllOrder();}

    public Object GetProductById(@PathVariable Long id)
    {return orderService.GetOrderById(id);}

}
