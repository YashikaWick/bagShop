package sanchana.bagShop.asset.discountRatio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sanchana.bagShop.asset.discountRatio.entity.DiscountRatio;

@Repository
public interface DiscountRatioDao extends JpaRepository< DiscountRatio, Integer > {
}
