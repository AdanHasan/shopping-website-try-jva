package com.ShoppingWebsiteApplication.repository;
import com.ShoppingWebsiteApplication.model.Item;

import java.util.List;

public interface ItemRepository {

    Long createItem(Item item );

    Item getItemById( Long itemId);

    void deleteItemById(Long itemId);

    void updateItem( Item item , Long itemId);

     List<Item> getAllItems();

}
