package sanchana.bagShop.asset.supplier.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sanchana.bagShop.asset.supplier.entity.Supplier;
import sanchana.bagShop.asset.supplierItem.entity.Enum.ItemSupplierStatus;

@Repository

public interface SupplierDao extends JpaRepository< Supplier, Integer> {
    Supplier findFirstByOrderByIdDesc();

    Supplier findByIdAndItemSupplierStatus(Integer supplierId, ItemSupplierStatus itemSupplierStatus);

}
