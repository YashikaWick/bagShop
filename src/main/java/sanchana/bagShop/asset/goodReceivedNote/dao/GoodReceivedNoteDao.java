package sanchana.bagShop.asset.goodReceivedNote.dao;


import sanchana.bagShop.asset.goodReceivedNote.entity.GoodReceivedNote;
import sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodReceivedNoteDao extends JpaRepository< GoodReceivedNote, Integer> {
    GoodReceivedNote findByPurchaseOrder(PurchaseOrder purchaseOrder);

}
