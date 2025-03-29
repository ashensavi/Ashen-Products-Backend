package edu.icet.ecom.dto;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Long userId;
    private List<Long> orderItemIds;
    private double total;
    private String status;
    private LocalDateTime date;
}
