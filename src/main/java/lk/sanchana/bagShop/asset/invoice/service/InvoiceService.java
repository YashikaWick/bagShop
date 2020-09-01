package lk.sanchana.bagShop.asset.invoice.service;

<<<<<<< HEAD
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InvoiceService implements AbstractService< Invoice, Integer > {
=======

import lk.sanchana.bagShop.asset.invoice.dao.InvoiceDao;
import lk.sanchana.bagShop.asset.invoice.entity.Invoice;
import lk.sanchana.bagShop.util.interfaces.AbstractService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "invoice")
public class InvoiceService implements AbstractService<Invoice,Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private final InvoiceDao invoiceDao;

    public InvoiceService(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

<<<<<<< HEAD

    public List< Invoice > findAll() {
        return invoiceDao.findAll();
    }

    public Invoice findById(Integer id) {
        return invoiceDao.getOne(id);
    }

    public Invoice persist(Invoice invoice) {
        return invoiceDao.save(invoice);
=======
    public List<Invoice> findAll() {
        return null;
    }

    public Invoice findById(Integer id) {
        return null;
    }

    public Invoice persist(Invoice invoice) {
        return null;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    }

    public boolean delete(Integer id) {
        return false;
    }

<<<<<<< HEAD
    public List< Invoice > search(Invoice invoice) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example< Invoice > invoiceExample = Example.of(invoice, matcher);
        return invoiceDao.findAll(invoiceExample);

    }

    public List< Invoice > findByCreatedAtIsBetween(LocalDateTime from, LocalDateTime to) {
        return invoiceDao.findByCreatedAtIsBetween(from, to);
    }

    public Invoice findByLastInvoice() {
        return invoiceDao.findFirstByOrderByIdDesc();
=======
    public List<Invoice> search(Invoice invoice) {
        return null;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    }
}
