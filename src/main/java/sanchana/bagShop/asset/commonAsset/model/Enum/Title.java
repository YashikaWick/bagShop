package sanchana.bagShop.asset.commonAsset.model.Enum;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Title {
    MR("Mr. "),
    MRS("Mrs. "),
    MS("Ms. ");

    public static Object Mr;
    private final String title;

    public class Mr {
    }
}

