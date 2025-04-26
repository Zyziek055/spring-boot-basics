package com.zyziek055.spring_boot_basics.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductSummaryDTO {
    private Long id;
    private String name;
}
