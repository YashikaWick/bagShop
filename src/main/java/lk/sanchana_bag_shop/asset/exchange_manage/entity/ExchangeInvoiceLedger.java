package lk.sanchana_bag_shop.asset.exchange_manage.entity;

import lk.sanchana_bag_shop.asset.invoice_ledger.entity.InvoiceLedger;
import lk.sanchana_bag_shop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeInvoiceLedger extends AuditEntity {


  @ManyToOne
  private InvoiceLedger invoiceLedger;

  private int count;

}
