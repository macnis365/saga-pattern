package com.macnis.ordermanagement.orderservice.services.commands;

import com.macnis.ecommerce.commands.CreateOrderCommand;
import com.macnis.ordermanagement.orderservice.aggregates.OrderStatus;
import com.macnis.ordermanagement.orderservice.dto.commands.OrderCreateDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class OrderCommandServiceImpl implements OrderCommandService {
    private final CommandGateway commandGateway;

    public OrderCommandServiceImpl(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @Override
    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO) {
        return commandGateway.send(new CreateOrderCommand(UUID.randomUUID().toString(), orderCreateDTO.getItemType(),
                orderCreateDTO.getPrice(), orderCreateDTO.getCurrency(), String.valueOf(OrderStatus.CREATED)));    }
}