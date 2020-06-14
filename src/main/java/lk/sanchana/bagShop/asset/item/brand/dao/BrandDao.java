package lk.sanchana.bagShop.asset.item.brand.dao;



import lk.sanchana.bagShop.asset.item.brand.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandDao extends JpaRepository<Brand, Integer> {
}
