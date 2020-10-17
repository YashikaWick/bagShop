package sanchana.bagShop.asset.item.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import sanchana.bagShop.asset.category.entity.Category;
import sanchana.bagShop.asset.brand.entity.Brand;
import sanchana.bagShop.asset.color.entity.ItemColor;
import sanchana.bagShop.asset.item.entity.Enum.ItemSize;
import sanchana.bagShop.asset.item.entity.Enum.ItemStatus;
import sanchana.bagShop.asset.ledger.entity.Ledger;
import sanchana.bagShop.asset.purchaseOrderItem.entity.PurchaseOrderItem;
import sanchana.bagShop.asset.supplierItem.entity.SupplierItem;
import sanchana.bagShop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter( "Item" )
public class Item extends AuditEntity {

    @Size(min = 5, message = "Your name cannot be accepted")
    private String name;

    private String rop;

    @Column( unique = true )
    private String code;

    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal sellPrice;

    @Enumerated( EnumType.STRING )
    private ItemStatus itemStatus;

    @Enumerated( EnumType.STRING)
    private ItemSize itemSize;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    private Brand brand;

    @ManyToOne
    private ItemColor itemColor;

    @OneToMany( mappedBy = "item" )
    private List< SupplierItem > supplierItems;

    @OneToMany( mappedBy = "item" )
    @JsonBackReference
    private List< Ledger > ledgers;

    @OneToMany( mappedBy = "item" )
    private List< PurchaseOrderItem > purchaseOrderItems;
}
