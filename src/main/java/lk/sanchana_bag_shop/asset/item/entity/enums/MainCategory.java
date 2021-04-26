package lk.sanchana_bag_shop.asset.item.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MainCategory {

    L("LADIES"),
    G("GENTS"),
    K("KIDS"),
    H("HANDMADE");


    private final String mainCategory;
}
