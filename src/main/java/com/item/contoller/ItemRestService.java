package com.item.contoller;

import com.item.entity.Item;
import com.item.services.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
//@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class ItemRestService {

//    private static final Logger logger = (Logger) LoggerFactory.getLogger(ItemRestService.class);

    @Autowired
    private IItemService IItemService;

    //get all Items
    @GetMapping("/items")
    public ResponseEntity<List<Item>> getItems() {
        try {
            System.out.println("Fetching All Item !!");
//            logger.info("Fetching All Items.");
            List<Item> items = this.IItemService.getItems();
            return ResponseEntity.ok(items);
        } catch (Exception exp) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //get by item id
    @GetMapping("/items/{itemId}")
    public ResponseEntity<Item> getItem(@PathVariable String itemId) {

        try {
            Item item = this.IItemService.getItem(itemId);
            return ResponseEntity.ok(item);
        } catch (Exception exp) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    // Add Item
    @PostMapping(path = "/items")
    public ResponseEntity<Item> addItem(@RequestBody Item item) {

        try {
            Item savedItem = this.IItemService.addItem(item);
            return ResponseEntity.ok(savedItem);
        } catch (Exception exp) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Update Item
    @PutMapping("/items/{itemId}")
    public ResponseEntity<Item> saveItem(@RequestBody Item item) {
        try {
            Item updatedItem = null;
            Item isItem = this.IItemService.getItem(item.getId());
            if (isItem != null) {
                updatedItem = this.IItemService.saveItem(item);
            }
            if (updatedItem != null) {
                return ResponseEntity.ok(updatedItem);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception exp) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/items/{itemId}")
    public ResponseEntity<HttpStatus> removeItem(@PathVariable String itemId) {
        try {
            this.IItemService.removeItem(itemId);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}