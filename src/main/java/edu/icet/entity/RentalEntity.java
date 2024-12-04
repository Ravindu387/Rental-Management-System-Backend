package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    private Integer id;
    private String cusName;
    private String itemName;
    private LocalDate rentalDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private Double totalCost;
    private Integer quantity;
}
