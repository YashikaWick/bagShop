package lk.sanchana.bagShop.asset.item.category.dao;



import lk.sanchana.bagShop.asset.item.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {
}
