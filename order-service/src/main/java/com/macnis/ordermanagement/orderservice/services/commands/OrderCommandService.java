package com.macnis.ordermanagement.orderservice.services.commands;

import com.macnis.ordermanagement.orderservice.dto.commands.OrderCreateDTO;

import java.util.concurrent.CompletableFuture;

public interface OrderCommandService {
    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);
}
