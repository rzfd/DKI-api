package org.example.inventoryapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDTO {
    private Long id;
    private String namaBarang;
    private Integer jumlahStok;
    private String nomorSeri;
    private Map<String, Object> additionalInfo;
    private String gambarPath;
    private String createdBy;
    private String updatedBy;
}

