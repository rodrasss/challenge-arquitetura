package com.example.arqsrv.application.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name = "cotacaoResponse", namespace = "http://example.com/frete")
@XmlAccessorType(XmlAccessType.FIELD)
public class FreteResponse {

    @XmlElement(namespace = "http://example.com/frete")
    private BigDecimal valorFrete;

    @XmlElement(namespace = "http://example.com/frete")
    private int prazoDias;

    public BigDecimal getValorFrete() { return valorFrete; }
    public void setValorFrete(BigDecimal valorFrete) { this.valorFrete = valorFrete; }

    public int getPrazoDias() { return prazoDias; }
    public void setPrazoDias(int prazoDias) { this.prazoDias = prazoDias; }
}
