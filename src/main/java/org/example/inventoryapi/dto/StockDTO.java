package org.example.inventoryapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

// StockDTO.java
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDTO {
    private Long id;
    private String namaBarang;
    private Integer jumlahStok;
    private String nomorSeri;
    private Map<String, Object> additionalInfo; // Dinamis JSON structure
    private String gambarPath; // Path untuk gambar yang disimpan
    private String createdBy;
    private String updatedBy;
}
