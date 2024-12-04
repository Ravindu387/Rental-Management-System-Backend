package edu.icet.service.impl;

import edu.icet.dto.Customer;
import edu.icet.dto.Item;
import edu.icet.entity.ItemEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
    }

    @Override
    public Optional<ItemEntity> searchCustomer(Integer itemId) {
        return repository.findById(itemId);
    }

    @Override
    public List<Item> getAll() {
        List<Item> itemArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            itemArrayList.add(mapper.map(entity, Item.class));
        });
        return itemArrayList;
    }

    @Override
    public void updateItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
    }

    @Override
    public void deleteItem(Integer itemId) {
        repository.deleteById(itemId);
    }
}
