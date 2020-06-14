package lk.sanchana.bagShop.asset.item.entity;

import com.fasterxml.jackson.annotation.JsonFilter;


import lk.sanchana.bagShop.asset.item.brand.entity.Brand;
import lk.sanchana.bagShop.asset.item.category.entity.Category;
import lk.sanchana.bagShop.asset.item.color.entity.ItemColor;
import lk.sanchana.bagShop.asset.item.entity.Enum.ItemSize;
import lk.sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrderItem;
import lk.sanchana.bagShop.asset.supplier.entity.SupplierItem;
import lk.sanchana.bagShop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Item")
public class Item extends AuditEntity {

    @Size(min = 5, message = "Your name cannot be accepted")
    private String name;

    private Integer rop;

    @Enumerated(EnumType.STRING)
    private ItemSize itemSize;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    private Brand brand;

    @ManyToOne
    private ItemColor itemColor;

    @OneToMany(mappedBy = "item")
    private List<PurchaseOrderItem> purchaseOrderItems;

/*    @OneToMany(mappedBy = "item")
    private List<ItemBatch> itemBatches;*/

    @OneToMany(mappedBy = "item")
    private List<SupplierItem> supplierItems;

}
