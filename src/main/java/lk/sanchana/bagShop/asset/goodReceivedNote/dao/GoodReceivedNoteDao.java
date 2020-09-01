package lk.sanchana.bagShop.asset.goodReceivedNote.dao;

<<<<<<< HEAD
=======


import lk.sanchana.bagShop.asset.goodReceivedNote.entity.GoodReceivedNote;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface GoodReceivedNoteDao extends JpaRepository< GoodReceivedNote, Integer> {
    GoodReceivedNote findByPurchaseOrder(PurchaseOrder purchaseOrder);
=======
public interface GoodReceivedNoteDao extends JpaRepository<GoodReceivedNote, Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}
