package sanchana.bagShop.asset.commonAsset.model.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LiveOrDead {
    ACTIVE("Active"),
    STOP("Stop");

    private final String liveOrDead;
}
