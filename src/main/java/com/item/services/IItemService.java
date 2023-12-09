package com.item.services;

import com.item.entity.Item;

import java.util.List;

public interface IItemService {

    public List<Item> getItems();

    public Item getItem(String itemId);

    public Item addItem(Item item);

    public Item saveItem(Item item);

    public void removeItem(String itemId);
}
