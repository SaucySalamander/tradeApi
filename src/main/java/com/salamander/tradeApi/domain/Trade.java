package com.salamander.tradeApi.domain;

import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;

public class Trade extends ResourceSupport{

    private Long tradeId;
    private BigDecimal amount;
    private String broker;

    public Trade(Long tradeId, BigDecimal amount, String broker) {
        this.tradeId = tradeId;
        this.amount = amount;
        this.broker = broker;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }
}
