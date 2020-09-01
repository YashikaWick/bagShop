package lk.sanchana.bagShop.asset.goodReceivedNote.service;



<<<<<<< HEAD
=======
import lk.sanchana.bagShop.asset.goodReceivedNote.dao.GoodReceivedNoteDao;
import lk.sanchana.bagShop.asset.goodReceivedNote.entity.GoodReceivedNote;
import lk.sanchana.bagShop.util.interfaces.AbstractService;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.*;

@Service
@CacheConfig(cacheNames = "goodReceivedNote")
public class GoodReceivedNoteService implements AbstractService< GoodReceivedNote, Integer> {
=======
import java.util.List;

@Service
@CacheConfig(cacheNames = "goodReceivedNote")
public class GoodReceivedNoteService implements AbstractService<GoodReceivedNote, Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private final GoodReceivedNoteDao goodReceivedNoteDao;

    @Autowired
    public GoodReceivedNoteService(GoodReceivedNoteDao goodReceivedNoteDao) {
        this.goodReceivedNoteDao = goodReceivedNoteDao;
    }

    @Override
    public List<GoodReceivedNote> findAll() {
        return goodReceivedNoteDao.findAll();
    }

    @Override
    public GoodReceivedNote findById(Integer id) {
        return goodReceivedNoteDao.getOne(id);
    }

    @Override
    public GoodReceivedNote persist(GoodReceivedNote goodReceivedNote) {
        return goodReceivedNoteDao.save(goodReceivedNote);
    }

    @Override
    public boolean delete(Integer id) {
        goodReceivedNoteDao.deleteById(id);
        return true;
    }

    @Override
    public List<GoodReceivedNote> search(GoodReceivedNote goodReceivedNote) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<GoodReceivedNote> goodReceivedNoteExample = Example.of(goodReceivedNote, matcher);
        return goodReceivedNoteDao.findAll(goodReceivedNoteExample);
    }
<<<<<<< HEAD


    public GoodReceivedNote findByPurchaseOrder(PurchaseOrder purchaseOrder) {
        return goodReceivedNoteDao.findByPurchaseOrder(purchaseOrder);
    }
=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}
