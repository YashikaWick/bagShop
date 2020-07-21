package lk.sanchana.bagShop.asset.purchaseOrder.dao;



import lk.sanchana.bagShop.asset.item.entity.Item;
import lk.sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrder;
import lk.sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface PurchaseOrderItemDao extends JpaRepository<PurchaseOrderItem, Integer> {
    PurchaseOrderItem findByPurchaseOrderAndItem(PurchaseOrder purchaseOrder, Item item);
    List<PurchaseOrderItem> findByPurchaseOrder(PurchaseOrder purchaseOrder);
}
