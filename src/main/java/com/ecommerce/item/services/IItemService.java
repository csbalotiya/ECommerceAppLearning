package com.ecommerce.item.services;

import com.ecommerce.item.entity.Item;

import java.util.List;

public interface IItemService {

    public List<Item> getItems();

    public Item getItem(String itemId);

    public Item addItem(Item item);

    public Item saveItem(Item item);

    public void removeItem(String itemId);
}
