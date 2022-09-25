package com.capitole.resource;


import com.capitole.domain.model.Price;
import com.capitole.domain.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/price")
public class PriceResource {

    private final PriceService service;

    @Autowired
    public PriceResource(PriceService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<Price>> findPrices(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                                              LocalDateTime date, @RequestParam Long productId,
                                                          @RequestParam Long brandId) {
        return new ResponseEntity<>(this.service.findPrices(date, productId, brandId), HttpStatus.OK);
    }


}
