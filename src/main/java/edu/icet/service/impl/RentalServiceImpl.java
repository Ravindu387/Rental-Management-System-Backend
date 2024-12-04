package edu.icet.service.impl;

import edu.icet.dto.Item;
import edu.icet.dto.Rental;
import edu.icet.entity.ItemEntity;
import edu.icet.entity.RentalEntity;
import edu.icet.repository.RentalRepository;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RentalServiceImpl implements RentalService {

    private final RentalRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addRental(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public List<Rental> getAll() {
        List<Rental> rentalArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
           rentalArrayList.add(mapper.map(entity, Rental.class));
        });
        return rentalArrayList;
    }

    @Override
    public void updateRental(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public void deleteRental(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<RentalEntity> searchRental(Integer id) {
        return repository.findById(id);
    }
}
