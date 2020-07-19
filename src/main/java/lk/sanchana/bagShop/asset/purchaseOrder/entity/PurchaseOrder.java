package lk.sanchana.bagShop.asset.purchaseOrder.entity;


import com.fasterxml.jackson.annotation.JsonFilter;

import lk.sanchana.bagShop.asset.employee.entity.Enum.EmployeeStatus;
import lk.sanchana.bagShop.asset.payment.entity.Payment;
import lk.sanchana.bagShop.asset.purchaseOrder.entity.Enum.PurchaseOrderStatus;
import lk.sanchana.bagShop.asset.supplier.entity.Supplier;
import lk.sanchana.bagShop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("PurchaseOrder")
public class PurchaseOrder extends AuditEntity {

    private String remark;

    @Size(min = 5, message = "Your P Order name cannot be accepted")
    private String name;

    @Column(nullable = false, unique = true)
    private String code;

    @Size(min = 5, message = "Your description cannot be accepted")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private PurchaseOrderStatus purchaseOrderStatus;


   @ManyToOne
    private Supplier supplier;

    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.PERSIST)
    private List<PurchaseOrderItem> purchaseOrderItems;


    @OneToMany(mappedBy = "purchaseOrder")
    private List<Payment> payments;

}
