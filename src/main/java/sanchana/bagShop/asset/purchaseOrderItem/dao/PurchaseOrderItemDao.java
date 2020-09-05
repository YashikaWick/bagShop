package sanchana.bagShop.asset.purchaseOrderItem.dao;



import sanchana.bagShop.asset.item.entity.Item;
import sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrder;
import sanchana.bagShop.asset.purchaseOrderItem.entity.PurchaseOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface PurchaseOrderItemDao extends JpaRepository<PurchaseOrderItem, Integer> {
    PurchaseOrderItem findByPurchaseOrderAndItem(PurchaseOrder purchaseOrder, Item item);
    List<PurchaseOrderItem> findByPurchaseOrder(PurchaseOrder purchaseOrder);
}
