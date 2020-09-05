package sanchana.bagShop.asset.commonAsset.model.Enum;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CivilStatus {

    MARRIED("Married"),
    SINGLE("Single"),
    WIDOW("Widow");

    private final String civilStatus;


}
