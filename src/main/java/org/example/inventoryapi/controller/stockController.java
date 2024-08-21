package org.example.inventoryapi.controller;

import jakarta.validation.Valid;
import org.example.inventoryapi.dto.StockDTO;
import org.example.inventoryapi.model.Stock;
import org.example.inventoryapi.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
@Validated
public class stockController {
    @Autowired
    private StockService stockService;

    @PostMapping
    public ResponseEntity<Stock> createStock(@Valid @RequestBody StockDTO stockDTO) {
        return ResponseEntity.ok(stockService.createStock(stockDTO));
    }

    @GetMapping
    public ResponseEntity<List<Stock>> listStocks() {
        return ResponseEntity.ok(stockService.listStocks());
    }

}