package sanchana.bagShop.asset.branch.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sanchana.bagShop.asset.branch.entity.Branch;

@Repository
public interface BranchDao extends JpaRepository< Branch, Integer> {
}