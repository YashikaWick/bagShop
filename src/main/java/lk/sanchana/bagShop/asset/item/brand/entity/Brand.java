package lk.sanchana.bagShop.asset.item.brand.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.sanchana.bagShop.asset.item.entity.Item;
import lk.sanchana.bagShop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Ledger")
public class Brand extends AuditEntity {
    @NotNull
    @Size(min = 1, message = "This name length should be more than one character")
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Item> items;
}
