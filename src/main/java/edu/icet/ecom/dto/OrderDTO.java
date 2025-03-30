package edu.icet.ecom.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Order items are required")
    private List<Long> orderItemIds;

    @Min(value = 0, message = "Total must be non-negative")
    private double total;

    @NotBlank(message = "Status is required")
    private String status;

    @NotNull(message = "Date is required")
    private LocalDateTime date;
}
