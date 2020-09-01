package lk.sanchana.bagShop.asset.goodReceivedNote.entity;

<<<<<<< HEAD


import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
=======
import com.fasterxml.jackson.annotation.JsonFilter;


import lk.sanchana.bagShop.asset.goodReceivedNote.entity.Enum.GoodReceivedNoteState;
import lk.sanchana.bagShop.asset.purchaseOrder.entity.PurchaseOrder;
import lk.sanchana.bagShop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
@JsonFilter( "GoodReceivedNote" )
@ToString
public class GoodReceivedNote extends AuditEntity {

    private String remarks;

    @Column( precision = 10, scale = 2 )
    private BigDecimal totalAmount;

    @Enumerated( EnumType.STRING )
    private GoodReceivedNoteState goodReceivedNoteState;
=======
@JsonFilter("GoodReceivedNote")
public class GoodReceivedNote extends AuditEntity {


/*    @Column(unique = true)
    private String code;*/

    private String remarks;
/*
    @Transient
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate mDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate eDate;*/

>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

    @ManyToOne
    private PurchaseOrder purchaseOrder;

<<<<<<< HEAD
    @OneToMany( mappedBy = "goodReceivedNote", cascade = CascadeType.PERSIST)
    private List< Ledger > ledgers;
=======
    @Column(precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private GoodReceivedNoteState goodReceivedNoteState;


>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b


}
