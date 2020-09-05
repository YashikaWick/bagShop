package sanchana.bagShop.asset.ledger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sanchana.bagShop.asset.item.entity.Item;
import sanchana.bagShop.asset.ledger.entity.Ledger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LedgerDao extends JpaRepository< Ledger, Integer> {
    List<Ledger> findByItem(Item item);

    Ledger findByItemAndAndExpiredDateAndSellPrice(Item item, LocalDate eDate, BigDecimal sellPrice);

    List< Ledger > findByCreatedAtIsBetween(LocalDateTime form, LocalDateTime to);

}
