package lk.sanchana_bag_shop.asset.exchange_manage.service;


import lk.sanchana_bag_shop.asset.exchange_manage.dao.ExchangeInvoiceLedgerDao;
import lk.sanchana_bag_shop.asset.exchange_manage.entity.ExchangeInvoiceLedger;
import lk.sanchana_bag_shop.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeInvoiceLedgerService implements AbstractService< ExchangeInvoiceLedger, Integer > {
  private final ExchangeInvoiceLedgerDao exchangeInvoiceLedgerDao;

  @Autowired
  public ExchangeInvoiceLedgerService(ExchangeInvoiceLedgerDao exchangeInvoiceLedgerDao) {
    this.exchangeInvoiceLedgerDao = exchangeInvoiceLedgerDao;
  }


  public List< ExchangeInvoiceLedger > findAll() {
    return exchangeInvoiceLedgerDao.findAll();
  }


  public ExchangeInvoiceLedger findById(Integer id) {
    return exchangeInvoiceLedgerDao.getOne(id);
  }


  public ExchangeInvoiceLedger persist(ExchangeInvoiceLedger exchangeInvoiceLedger) {
    return exchangeInvoiceLedgerDao.save(exchangeInvoiceLedger);
  }


  public boolean delete(Integer id) {
    exchangeInvoiceLedgerDao.deleteById(id);
    //not applicable
    return false;
  }


  public List< ExchangeInvoiceLedger > search(ExchangeInvoiceLedger exchangeInvoiceLedger) {
    ExampleMatcher matcher = ExampleMatcher
        .matching()
        .withIgnoreCase()
        .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
    Example< ExchangeInvoiceLedger > brandExample = Example.of(exchangeInvoiceLedger, matcher);
    return exchangeInvoiceLedgerDao.findAll(brandExample);
  }
}
