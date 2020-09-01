package lk.sanchana.bagShop.asset.invoice.dao;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface InvoiceDao extends JpaRepository< Invoice, Integer > {
    List< Invoice > findByCreatedAtIsBetween(LocalDateTime form, LocalDateTime to);

    Invoice findFirstByOrderByIdDesc();
=======


import lk.sanchana.bagShop.asset.invoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice,Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}
