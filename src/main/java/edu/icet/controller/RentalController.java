package edu.icet.controller;

import edu.icet.dto.Item;
import edu.icet.dto.Rental;
import edu.icet.entity.ItemEntity;
import edu.icet.entity.RentalEntity;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rental")
@RequiredArgsConstructor
@CrossOrigin
public class RentalController {
    private final RentalService service;

    @PostMapping("/add")
    public void addRental(@RequestBody Rental rental){
        service.addRental(rental);
    }
    @GetMapping("/get-all")
    public List<Rental> getAll(){
        return service.getAll();
    }
    @PutMapping("/update")
    public void updateRental (@RequestBody Rental rental){
        service.updateRental(rental);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteRental(@PathVariable Integer id){
        service.deleteRental(id);
    }
    @GetMapping("/search/{id}")
    public Optional<RentalEntity> searchRental(@PathVariable Integer id){
        return service.searchRental(id);
    }
}
