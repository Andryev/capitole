package com.capitole.domain.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@ToString(of = "id")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = Price.TABLE_NAME)
public class Price implements Serializable {

    public static final String TABLE_NAME = "PRICES";

    @Serial
    private static final long serialVersionUID = -5083007013920545293L;

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="BRAND_ID")
    private Long brandId;

    @Column(name="START_DATE")
    private LocalDateTime startDate;

    @Column(name="PRICE_LIST")
    private Long priceList;

    @Column(name="PRODUCT_ID")
    private Long productId;

    @Column(name="PRIORITY")
    private Long priority;

    @Column(name="PRICE")
    private Double price;

    @Column(name="CURR")
    private String curr;

    @Column(name="END_DATE")
    private LocalDateTime endDate;
}
