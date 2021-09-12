package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;

import java.time.LocalDate;

public class SaleDto {

    private Long id;
    private int visited;
    private int deals;
    private Double amount;
    private LocalDate date;

    private SellerDto sellerDto;

    public SaleDto(){
    }

    public SaleDto(Long id, int visited, int deals, Double amount, LocalDate date, SellerDto sellerDto) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.sellerDto = sellerDto;
    }

    public SaleDto(Sale entity) {
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        sellerDto = new SellerDto(entity.getSeller());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getDeals() {
        return deals;
    }

    public void setDeals(int deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerDto getSellerDto() {
        return sellerDto;
    }

    public void setSellerDto(SellerDto sellerDto) {
        this.sellerDto = sellerDto;
    }
}
