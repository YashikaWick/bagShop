package lk.sanchana.bagShop.asset.invoice.entity;

<<<<<<< HEAD


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
=======
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lk.sanchana.bagShop.asset.customer.entity.Customer;
import lk.sanchana.bagShop.asset.invoice.entity.Enum.InvoicePrintOrNot;
import lk.sanchana.bagShop.asset.payment.entity.Enum.PaymentMethod;
import lk.sanchana.bagShop.util.audit.AuditEntity;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
<<<<<<< HEAD
import java.util.*;
=======
import java.util.List;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Invoice")
@JsonIgnoreProperties(value = {"balance", "discountAmount", "bankName", "cardNumber"}, allowGetters = true)
public class Invoice extends AuditEntity {

    private String bankName;

    private String cardNumber;

    private String remarks;

    @Column(nullable = false, unique = true)
    private String code;

<<<<<<< HEAD
=======
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @Column(nullable = false, precision = 10, scale = 2)
<<<<<<< HEAD
    private BigDecimal totalAmount;
=======
    private BigDecimal TotalAmount;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

    @Column(precision = 10, scale = 2)
    private BigDecimal discountAmount;

    @Column(precision = 10, scale = 2)
    private BigDecimal amountTendered;

    @Column(precision = 10, scale = 2)
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private InvoicePrintOrNot invoicePrintOrNot;

<<<<<<< HEAD
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private InvoiceValidOrNot invoiceValidOrNot;

=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    @ManyToOne
    private Customer customer;

    @ManyToOne
    private DiscountRatio discountRatio;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "invoice")
<<<<<<< HEAD
    private List< InvoiceItem > invoiceItemQuantities;
=======
    private List<InvoiceItemQuantity> invoiceItemQuantities;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b


}
