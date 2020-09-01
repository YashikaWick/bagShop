package lk.sanchana.bagShop.asset.item.service;

<<<<<<< HEAD
=======


import lk.sanchana.bagShop.asset.item.dao.ItemDao;
import lk.sanchana.bagShop.asset.item.entity.Item;
import lk.sanchana.bagShop.util.interfaces.AbstractService;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
<<<<<<< HEAD
@CacheConfig(cacheNames = "item")
public class ItemService implements AbstractService< Item, Integer> {
    private final ItemDao itemDao;
    private final LedgerDao ledgerDao;

    @Autowired
    public ItemService(ItemDao itemDao, LedgerDao ledgerDao) {
        this.itemDao = itemDao;
        this.ledgerDao = ledgerDao;
=======
@CacheConfig( cacheNames = "item" )
public class ItemService implements AbstractService<Item, Integer> {
    private final ItemDao itemDao;

    @Autowired
    public ItemService(ItemDao itemDao) {
        this.itemDao = itemDao;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    }

    public List<Item> findAll() {
        return itemDao.findAll();
    }

    public Item findById(Integer id) {
        return itemDao.getOne(id);
    }

<<<<<<< HEAD
    private String makeItemCode(String lastNumber){
        String newNumber = "";
        if (lastNumber !=null) {
            int number = Integer.parseInt(lastNumber);

            if (number<10){
                newNumber = "00"+ (number + 1);
            }
            if (10 < number && number < 100){
                newNumber = "0"+ (number + 1);
            }
            if (100<number){
                newNumber = String.valueOf(number+1);
            }
            return newNumber;
        }else {
            return  "0001";

        }
    }

    public Item persist(Item item) {
        if (item.getId() == null) {
            //need to create code to item
            String code =item.getCategory().getMainCategory()
                    + item.getCategory().getName().trim().substring(0,2)
                    + item.getName().trim().substring(0,2);
            //check last item on db
            Item itemDB = itemDao.findFirstByOrderByIdDesc();
            if ( itemDB != null ){
                item.setCode(code +makeItemCode(itemDB.getCode().substring(6)));
            }else{
                      item.setCode(code +makeItemCode(null));
            }
            item.setItemStatus(ItemStatus.NOT_AVAILABLE);
        }
=======
    public Item persist(Item item) {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
        return itemDao.save(item);
    }

    public boolean delete(Integer id) {
        itemDao.deleteById(id);
        return false;
    }

    public List<Item> search(Item item) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Item> itemExample = Example.of(item, matcher);
        return itemDao.findAll(itemExample);
    }

<<<<<<< HEAD
    public List< Item> findByCategory(Category category) {
    return itemDao.findByCategoryOrderByIdDesc(category);
    }
}
=======
    public Item lastItem() {
        return itemDao.findFirstByOrderByIdDesc();
    }
}
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
