package lk.sanchana_bag_shop.asset.exchange_manage.dao;


import lk.sanchana_bag_shop.asset.brand.entity.Brand;
import lk.sanchana_bag_shop.asset.exchange_manage.entity.ExchangeInvoiceLedger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository
public interface ExchangeInvoiceLedgerDao extends JpaRepository< ExchangeInvoiceLedger, Integer> {
}
