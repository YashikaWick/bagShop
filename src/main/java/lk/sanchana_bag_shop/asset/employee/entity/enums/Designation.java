package lk.sanchana_bag_shop.asset.employee.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Designation {
  ADMIN("Admin"),
  MANAGER("Manager"),
  PROCUREMENT_MANAGER("Procurement Manager"),
  HR_MANAGER("HR Manager"),
  ACCOUNT_MANAGER("Account Manager"),
  CASHIER("Cashier");

  private final String designation;

//sir thawa podi ekak mata methana designation change karann beri weid?
//  hr manager and procurment mager ain krl single manager kenek hari tiyala stock keeper kenek danna beri weida?

}
