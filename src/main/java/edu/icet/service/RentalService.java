package edu.icet.service;

import edu.icet.dto.Rental;
import edu.icet.entity.ItemEntity;
import edu.icet.entity.RentalEntity;

import java.util.List;
import java.util.Optional;

public interface RentalService {
    void addRental(Rental rental);
    List<Rental> getAll();
    void updateRental(Rental rental);
    void deleteRental(Integer id);
    Optional<RentalEntity> searchRental(Integer id);
}
