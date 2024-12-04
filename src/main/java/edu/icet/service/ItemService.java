package edu.icet.service;

import edu.icet.dto.Item;
import edu.icet.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    void addItem(Item item);
    Optional<ItemEntity> searchCustomer(Integer itemId);
    List<Item> getAll();
    void updateItem(Item item);
    void deleteItem(Integer itemId);
}
