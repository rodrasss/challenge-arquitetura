package com.example.arqsrv.application.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cotacaoRequest", namespace = "http://example.com/frete")
@XmlAccessorType(XmlAccessType.FIELD)
public class FreteRequest {

    @XmlElement(namespace = "http://example.com/frete")
    private Long pedidoId;

    @XmlElement(namespace = "http://example.com/frete")
    private String cepDestino;

    public Long getPedidoId() { return pedidoId; }
    public void setPedidoId(Long pedidoId) { this.pedidoId = pedidoId; }

    public String getCepDestino() { return cepDestino; }
    public void setCepDestino(String cepDestino) { this.cepDestino = cepDestino; }
}
