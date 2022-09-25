package com.capitole.domain.service;

import com.capitole.domain.model.Price;
import com.capitole.domain.respository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceService {

    private final PriceRepository repository;

    @Autowired
    public PriceService(PriceRepository repository) {
        this.repository = repository;
    }


    public List<Price> findPrices(LocalDateTime date, Long productId, Long brandId) {

        return this.repository.findAllByStartDateLessThanEqualAndEndDateGreaterThanEqualAndProductIdAndBrandIdOrderById(
                date, date, productId, brandId);
    }
}
