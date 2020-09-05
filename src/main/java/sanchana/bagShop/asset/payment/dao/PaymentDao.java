package sanchana.bagShop.asset.payment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sanchana.bagShop.asset.payment.entity.Payment;
import sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrder;

import java.util.List;

public interface PaymentDao extends JpaRepository< Payment,Integer> {
    List< Payment > findByPurchaseOrder(PurchaseOrder purchaseOrder);

    Payment findFirstByOrderByIdDesc();
}
