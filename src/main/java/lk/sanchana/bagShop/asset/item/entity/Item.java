package lk.sanchana.bagShop.asset.item.entity;

<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.samarasingherSuper.asset.PurchaseOrder.entity.PurchaseOrderItem;
import lk.samarasingherSuper.asset.category.entity.Category;
import lk.samarasingherSuper.asset.item.entity.Enum.ItemStatus;
import lk.samarasingherSuper.asset.ledger.entity.Ledger;
import lk.samarasingherSuper.asset.supplierItem.entity.SupplierItem;
import lk.samarasingherSuper.util.audit.AuditEntity;
=======
import com.fasterxml.jackson.annotation.JsonFilter;


import lk.sanchana.bagShop.asset.item.brand.entity.Brand;
import lk.sanchana.bagShop.asset.item.category.entity.Category;
import lk.sanchana.bagShop.asset.item.color.entity.ItemColor;
import lk.sanchana.bagShop.asset.item.entity.Enum.ItemSize;
import lk.sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrderItem;
import lk.sanchana.bagShop.asset.supplier.entity.SupplierItem;
import lk.sanchana.bagShop.util.audit.AuditEntity;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
<<<<<<< HEAD
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
=======
import javax.validation.constraints.Size;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
@JsonFilter( "Item" )
public class Item extends AuditEntity {

    @Size( min = 5, message = "Your name cannot be accepted" )
    private String name;

    @NotEmpty
    private String rop;

    @Column( unique = true )
    private String code;

    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal sellPrice;

    @Enumerated( EnumType.STRING )
    private ItemStatus itemStatus;

    @ManyToOne
    private Category category;

    @OneToMany( mappedBy = "item" )
    private List< SupplierItem > supplierItems;

    @OneToMany( mappedBy = "item" )
    @JsonBackReference
    private List< Ledger > ledgers;

    @OneToMany( mappedBy = "item" )
    private List< PurchaseOrderItem > purchaseOrderItems;
=======
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

>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}
