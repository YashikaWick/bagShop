package lk.sanchana.bagShop.asset.invoice.dao;



import lk.sanchana.bagShop.asset.invoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice,Integer> {
}
