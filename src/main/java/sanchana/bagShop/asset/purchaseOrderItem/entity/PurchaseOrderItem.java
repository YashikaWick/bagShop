package sanchana.bagShop.asset.purchaseOrderItem.entity;


import com.fasterxml.jackson.annotation.JsonFilter;

import sanchana.bagShop.asset.item.entity.Item;
import sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrder;
import sanchana.bagShop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("PurchaseOrderItem")
public class PurchaseOrderItem extends AuditEntity {
    @Column(nullable = false)
    private String quantity;

    private String receivedQuantity;

    @ManyToOne
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    private Item item;

}
