package com.capitole.domain.respository;

import com.capitole.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PriceRepository  extends JpaRepository<Price, Long> {

    List<Price> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqualAndProductIdAndBrandIdOrderById(LocalDateTime start,
                                                                                                LocalDateTime end,
                                                                                                Long productId,
                                                                                                Long brandId);
}
