package lk.sanchana.bagShop.asset.item.color.dao;


import lk.sanchana.bagShop.asset.item.color.entity.ItemColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ItemColorDao extends JpaRepository<ItemColor, Integer> {

}
