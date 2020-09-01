package lk.sanchana.bagShop.asset.payment.entity;
<<<<<<< HEAD



import com.fasterxml.jackson.annotation.JsonFilter;
=======
import com.fasterxml.jackson.annotation.JsonFilter;
import lk.sanchana.bagShop.asset.payment.entity.Enum.PaymentMethod;
import lk.sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrder;
import lk.sanchana.bagShop.util.audit.AuditEntity;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Payment")
public class Payment extends AuditEntity {
<<<<<<< HEAD

=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private String bankName;

    private String remarks;

    @Column(nullable = false, unique = true)
    private String code;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

<<<<<<< HEAD
    @ManyToOne(fetch = FetchType.EAGER)
=======
    @ManyToOne
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private PurchaseOrder purchaseOrder;
}
