package lk.sanchana_bag_shop.asset.item.entity.Enum;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ItemStatus {
    AVAILABLE("Available"),
    NOT_AVAILABLE("Out of Stock"),
    ROP("Need to order"),
    ORDERED("On Order"),
    DAMAGE("Damage"),
    RETURN("Return"),
    STOP("Removed");

    private final String itemStatus;
}

