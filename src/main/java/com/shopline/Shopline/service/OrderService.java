package com.shopline.Shopline.service;
import com.shopline.Shopline.dto.OrderDto;
import com.shopline.Shopline.repository.OrderRepository;
import com.shopline.Shopline.model.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService (OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

//    public Object getUserById(Long id) {
//        return orderRepository.get();
//    }

    public Object CreateOrder (OrderDto orderDto) {
        Order order = new Order();
        Order.setUserId(OrderDto.getUserId());

        return orderRepository.save(order);
    }
    public Object GetAllOrder() {
        return orderRepository.findAll();
    }
    public Object GetOrderById(Long id) {
        return orderRepository.findById(id);}
}

