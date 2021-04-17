package lk.sanchana_bag_shop.asset.employee.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Designation {
  ADMIN("ADMIN"),
  CASHIER("CASHIER"),
  SK("STOCK KEEPER"),
  MANAGER("MANAGER"),
  ACC("ACCOUNTANT");

  private final String designation;
}
