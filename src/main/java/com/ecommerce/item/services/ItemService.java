package com.ecommerce.item.services;

import com.ecommerce.item.entity.Item;
import com.ecommerce.item.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemService implements IItemService {

    @Autowired
    private ItemDao itemDao;

    public ItemService() {
    }

    @Override
    public List<Item> getItems() {
        // TODO Auto-generated method stub
        return itemDao.findAll();
    }

    @Override
    public Item getItem(String itemId) {
        // TODO Auto-generated method stub
        System.out.println("get itemloyee : " + itemDao.findById(itemId).get());
        return itemDao.findById(itemId).get();
        //return itemDao.getOne(itemId);
    }

    @Override
    public Item addItem(Item item) {
        // TODO Auto-generated method stub
        item.setId(UUID.randomUUID().toString());
        itemDao.save(item);
        return item;
    }

    @Override
    public Item saveItem(Item item) {
        Item isItem = itemDao.findById(item.getId()).get();
        if (isItem != null) {
            itemDao.save(item);
            return item;
        }
        return isItem;
    }

    @Override
    public void removeItem(String parseLong) {
        // TODO Auto-generated method stub
        Item entity = itemDao.getOne(parseLong);
        itemDao.delete(entity);
    }

}
