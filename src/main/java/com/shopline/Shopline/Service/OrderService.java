package com.shopline.Shopline.Service;
import com.shopline.Shopline.Dto.OrderDto;
import com.shopline.Shopline.Repository.OrderRepository;
import com.shopline.Shopline.Model.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService (OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Object CreateOrder (OrderDto orderDto) {
        Order order = new Order();

        order.setTotalAmount(orderDto.getTotalAmount());

        return orderRepository.save(order);
    }
    public Object GetAllOrder() {return orderRepository.findAll();}

    public Object GetOrderById(Long id) {return orderRepository.findById(id);}
}
