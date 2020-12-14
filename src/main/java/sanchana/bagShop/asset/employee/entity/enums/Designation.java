package sanchana.bagShop.asset.employee.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Designation {
    OW("Owner"),
    SK("Stock Keeper"),
    AA("Account Assistant"),
    CA("Cashier");

    private final String designation;
}
