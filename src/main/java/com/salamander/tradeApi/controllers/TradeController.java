package com.salamander.tradeApi.controllers;

import com.salamander.tradeApi.domain.Trade;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class TradeController {

    private static final String TEMPLATE = "%s";

    @GetMapping(value = "/processTrade", produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Trade> getTrade(
            @RequestParam(value = "name", required = false, defaultValue = "John Doe") String name) {

        Trade trade = new Trade(new Long(1234), new BigDecimal(1234), String.format(TEMPLATE, name));
        trade.add(linkTo(methodOn(TradeController.class).getTrade(name)).withSelfRel());

        return new ResponseEntity<Trade>(trade, HttpStatus.OK);
    }
}
