package com.example.arqsrv.application.controller;

import com.example.arqsrv.domain.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes/hello")
    public String hello() {
        return clienteService.hello();
    }
}
