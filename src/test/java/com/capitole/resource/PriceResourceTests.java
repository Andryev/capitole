package com.capitole.resource;


import com.capitole.domain.model.Price;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@ExtendWith(
        SpringExtension.class
)
@SpringBootTest
public class PriceResourceTests {

    @Autowired
    PriceResource resource;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    @Order(value = 1)
    void firstTestOk() {
        LocalDateTime date = LocalDateTime.parse("2020-06-14 10:00:00", dateTimeFormatter);
        Long productId = 35455L;
        Long brandId = 1L;

        ResponseEntity<List<Price>> response = resource.findPrices(date, productId, brandId);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatusCode().value());
        List<Price> body = response.getBody();
        Price priceResult = body.get(0);
        Assertions.assertEquals(1, body.size());
        Assertions.assertEquals(brandId, priceResult.getBrandId());
        Assertions.assertEquals("EUR", priceResult.getCurr());
        Assertions.assertEquals(0, priceResult.getPriority());
        Assertions.assertEquals(1, priceResult.getPriceList());
        Assertions.assertEquals(productId, priceResult.getProductId());
        Assertions.assertEquals(35.5, priceResult.getPrice());
    }


    /**
     * Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    @Order(value = 2)
    void secondTestOk() {
        LocalDateTime date = LocalDateTime.parse("2020-06-14 16:00:00", dateTimeFormatter);
        Long productId = 35455L;
        Long brandId = 1L;

        ResponseEntity<List<Price>> response = resource.findPrices(date, productId, brandId);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatusCode().value());
        List<Price> body = response.getBody();
        Assertions.assertEquals(2, body.size());

        Price priceResult = body.get(0);
        Assertions.assertEquals(brandId, priceResult.getBrandId());
        Assertions.assertEquals("EUR", priceResult.getCurr());
        Assertions.assertEquals(0, priceResult.getPriority());
        Assertions.assertEquals(1, priceResult.getPriceList());
        Assertions.assertEquals(productId, priceResult.getProductId());
        Assertions.assertEquals(35.5, priceResult.getPrice());

        Price priceResultSecond = body.get(1);
        Assertions.assertEquals(brandId, priceResultSecond.getBrandId());
        Assertions.assertEquals("EUR", priceResultSecond.getCurr());
        Assertions.assertEquals(1, priceResultSecond.getPriority());
        Assertions.assertEquals(2, priceResultSecond.getPriceList());
        Assertions.assertEquals(productId, priceResultSecond.getProductId());
        Assertions.assertEquals(25.45, priceResultSecond.getPrice());
    }

    /**
     * Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    @Order(value = 3)
    void thirdTestOk() {
        LocalDateTime date = LocalDateTime.parse("2020-06-14 21:00:00", dateTimeFormatter);
        Long productId = 35455L;
        Long brandId = 1L;

        ResponseEntity<List<Price>> response = resource.findPrices(date, productId, brandId);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatusCode().value());
        List<Price> body = response.getBody();
        Assertions.assertEquals(1, body.size());

        Price priceResult = body.get(0);
        Assertions.assertEquals(brandId, priceResult.getBrandId());
        Assertions.assertEquals("EUR", priceResult.getCurr());
        Assertions.assertEquals(0, priceResult.getPriority());
        Assertions.assertEquals(1, priceResult.getPriceList());
        Assertions.assertEquals(productId, priceResult.getProductId());
        Assertions.assertEquals(35.5, priceResult.getPrice());
    }

    /**
     * Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    @Order(value = 4)
    void fourthTestOk() {
        LocalDateTime date = LocalDateTime.parse("2020-06-15 10:00:00", dateTimeFormatter);
        Long productId = 35455L;
        Long brandId = 1L;

        ResponseEntity<List<Price>> response = resource.findPrices(date, productId, brandId);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatusCode().value());
        List<Price> body = response.getBody();
        Assertions.assertEquals(2, body.size());

        Price priceResult = body.get(0);
        Assertions.assertEquals(brandId, priceResult.getBrandId());
        Assertions.assertEquals("EUR", priceResult.getCurr());
        Assertions.assertEquals(0, priceResult.getPriority());
        Assertions.assertEquals(1, priceResult.getPriceList());
        Assertions.assertEquals(productId, priceResult.getProductId());
        Assertions.assertEquals(35.5, priceResult.getPrice());

        Price priceResultSecond = body.get(1);
        Assertions.assertEquals(brandId, priceResultSecond.getBrandId());
        Assertions.assertEquals("EUR", priceResultSecond.getCurr());
        Assertions.assertEquals(1, priceResultSecond.getPriority());
        Assertions.assertEquals(3, priceResultSecond.getPriceList());
        Assertions.assertEquals(productId, priceResultSecond.getProductId());
        Assertions.assertEquals(30.5, priceResultSecond.getPrice());
    }


    /**
     * Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    @Order(value = 5)
    void fifthTestOk() {
        LocalDateTime date = LocalDateTime.parse("2020-06-16 21:00:00", dateTimeFormatter);
        Long productId = 35455L;
        Long brandId = 1L;

        ResponseEntity<List<Price>> response = resource.findPrices(date, productId, brandId);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatusCode().value());
        List<Price> body = response.getBody();
        Assertions.assertEquals(2, body.size());

        Price priceResult = body.get(0);
        Assertions.assertEquals(brandId, priceResult.getBrandId());
        Assertions.assertEquals("EUR", priceResult.getCurr());
        Assertions.assertEquals(0, priceResult.getPriority());
        Assertions.assertEquals(1, priceResult.getPriceList());
        Assertions.assertEquals(productId, priceResult.getProductId());
        Assertions.assertEquals(35.5, priceResult.getPrice());

        Price priceResultSecond = body.get(1);
        Assertions.assertEquals(brandId, priceResultSecond.getBrandId());
        Assertions.assertEquals("EUR", priceResultSecond.getCurr());
        Assertions.assertEquals(1, priceResultSecond.getPriority());
        Assertions.assertEquals(4, priceResultSecond.getPriceList());
        Assertions.assertEquals(productId, priceResultSecond.getProductId());
        Assertions.assertEquals(38.95, priceResultSecond.getPrice());
    }

}
