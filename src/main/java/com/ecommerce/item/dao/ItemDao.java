package com.ecommerce.item.dao;

import com.ecommerce.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item, String> {

}
