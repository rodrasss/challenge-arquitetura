package com.example.arqsrv.application.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigDecimal;

@Endpoint
public class FreteEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/frete";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "cotacaoRequest")
    @ResponsePayload
    public FreteResponse cotarFrete(@RequestPayload FreteRequest request) {
        FreteResponse response = new FreteResponse();
        response.setValorFrete(BigDecimal.valueOf(29.90));
        response.setPrazoDias(5);
        return response;
    }
}
