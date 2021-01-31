package lk.sanchana_bag_shop.asset.color.dao;


import lk.sanchana_bag_shop.asset.color.entity.ItemColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemColorDao extends JpaRepository<ItemColor, Integer> {

}
