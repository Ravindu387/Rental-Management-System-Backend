package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.dto.Item;
import edu.icet.entity.CustomerEntity;
import edu.icet.entity.ItemEntity;
import edu.icet.service.CustomerService;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController {
    @Autowired
    private final ItemService service;

    @PostMapping("/add")
    public void addItem(@RequestBody Item item){
        System.out.println(item);
        service.addItem(item);
    }
    @GetMapping("/search/{itemId}")
    public Optional<ItemEntity> searchItem(@PathVariable Integer itemId){
        return service.searchCustomer(itemId);
    }
    @GetMapping("/get-all")
    public List<Item> getAll(){
        return service.getAll();
    }
    @PutMapping("/update")
    public void updateItem (@RequestBody Item item){
        service.updateItem(item);
    }
    @DeleteMapping("/delete/{itemId}")
    public void deleteItem(@PathVariable Integer itemId){
        service.deleteItem(itemId);
    }
}
