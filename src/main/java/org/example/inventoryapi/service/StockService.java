package org.example.inventoryapi.service;

import org.example.inventoryapi.dto.StockDTO;
import org.example.inventoryapi.model.Stock;
import org.example.inventoryapi.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public Stock createStock(StockDTO stockDTO) {
        Stock stock = new Stock();
        stock.setName(stockDTO.getNamaBarang());
        stock.setQuantity(stockDTO.getJumlahStok());
        stock.setSerialNumber(stockDTO.getNomorSeri());
        stock.setAdditionalInfo(stockDTO.getAdditionalInfo());
        stock.setImage(stockDTO.getGambarPath().getBytes());
        stock.setCreatedAt(LocalDateTime.now());
        stock.setCreatedBy(stockDTO.getCreatedBy());
        return stockRepository.save(stock);
    }

    public List<Stock> listStocks() {
        return stockRepository.findAll();
    }

    public Optional<Stock> getStockById(Long id) {
        return stockRepository.findById(id);
    }
}


