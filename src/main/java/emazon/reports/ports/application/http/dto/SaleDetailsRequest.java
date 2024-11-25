package emazon.reports.ports.application.http.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaleDetailsRequest {
    private Long saleDetailsId;
    private Long productId;
    private Integer quantity;
    private Double price;
    private Double subtotal;
}
