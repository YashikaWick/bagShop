package lk.sanchana.bagShop.asset.invoice.entity.Enum;

<<<<<<< HEAD

=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InvoiceState {
    PAID("Paid"),
    CANCELLED("Cancelled");

    private final String invoiceState;
}
