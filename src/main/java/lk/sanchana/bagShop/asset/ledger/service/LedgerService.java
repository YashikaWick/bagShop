package lk.sanchana.bagShop.asset.ledger.service;


<<<<<<< HEAD
=======
import lk.sanchana.bagShop.asset.ledger.dao.LedgerDao;
import lk.sanchana.bagShop.asset.ledger.entity.Ledger;
import lk.sanchana.bagShop.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import java.util.List;

@Service
@CacheConfig(cacheNames = "ledger")
<<<<<<< HEAD
public class LedgerService implements AbstractService< Ledger, Integer> {
    private final LedgerDao ledgerDao;

=======
public class LedgerService implements AbstractService<Ledger, Integer> {
    private final LedgerDao ledgerDao;

    @Autowired
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public LedgerService(LedgerDao ledgerDao) {
        this.ledgerDao = ledgerDao;
    }

<<<<<<< HEAD

=======
    @Override
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public List<Ledger> findAll() {
        return ledgerDao.findAll();
    }

<<<<<<< HEAD

=======
    @Override
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public Ledger findById(Integer id) {
        return ledgerDao.getOne(id);
    }

<<<<<<< HEAD

=======
    @Override
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public Ledger persist(Ledger ledger) {
        return ledgerDao.save(ledger);
    }

<<<<<<< HEAD

=======
    @Override
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public boolean delete(Integer id) {
        //not applicable
        return false;
    }

<<<<<<< HEAD

=======
    @Override
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public List<Ledger> search(Ledger ledger) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Ledger> ledgerExample = Example.of(ledger, matcher);
        return ledgerDao.findAll(ledgerExample);
    }
<<<<<<< HEAD

    public List<Ledger> findByItem(Item item) {
        return ledgerDao.findByItem(item);
    }

    public Ledger findByItemAndAndExpiredDateAndSellPrice(Item item, LocalDate eDate, BigDecimal sellPrice) {
    return ledgerDao.findByItemAndAndExpiredDateAndSellPrice( item, eDate, sellPrice);
    }

    public List<Ledger> findByCreatedAtIsBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return ledgerDao.findByCreatedAtIsBetween(startDate, endDate);
    }

   /* public Ledger findByItem(Item item) {
        return ledgerDao.findByItem(item);
    }*/
=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}
