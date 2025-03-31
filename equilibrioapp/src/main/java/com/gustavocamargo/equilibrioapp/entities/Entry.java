package com.gustavocamargo.equilibrioapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "entry")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Entry extends DefaultEntity{

    private LocalDate entryDate;

    public Entry(Long id, String description, BigDecimal totalValue, Boolean checkStatus, String responsible, LocalDate entryDate) {
        super(id, description, totalValue, checkStatus, responsible);
        this.entryDate = entryDate;
    }
}
