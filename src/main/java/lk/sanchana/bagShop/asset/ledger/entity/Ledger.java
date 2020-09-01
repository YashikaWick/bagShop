package lk.sanchana.bagShop.asset.ledger.entity;

<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
=======
import com.fasterxml.jackson.annotation.JsonFilter;


import lk.sanchana.bagShop.asset.item.entity.ItemBatch;
import lk.sanchana.bagShop.util.audit.AuditEntity;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
<<<<<<< HEAD
import org.springframework.format.annotation.DateTimeFormat;
=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
<<<<<<< HEAD
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.LocalDate;
=======
import java.math.BigDecimal;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
@JsonFilter( "Ledger" )
public class Ledger extends AuditEntity {

    @NotEmpty
    private String quantity;

    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal sellPrice;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate manufactureDate;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate expiredDate;

    @ManyToOne
    @JsonManagedReference
    private Item item;

    @ManyToOne
    @JsonIgnore
    private GoodReceivedNote goodReceivedNote;


=======
@JsonFilter("Ledger")
public class Ledger extends AuditEntity {

    @ManyToOne
    private ItemBatch itemBatch;

    @Column(precision = 10, scale = 2)
    private BigDecimal sellPrice;

    private String quantity;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}
