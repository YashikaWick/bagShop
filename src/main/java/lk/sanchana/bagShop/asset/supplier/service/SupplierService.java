package lk.sanchana.bagShop.asset.supplier.service;

<<<<<<< HEAD
=======



import lk.sanchana.bagShop.asset.supplier.dao.SupplierDao;
import lk.sanchana.bagShop.asset.supplier.entity.Supplier;
import lk.sanchana.bagShop.util.interfaces.AbstractService;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

<<<<<<< HEAD
@Service
@CacheConfig(cacheNames = "supplier")
public class SupplierService implements AbstractService< Supplier, Integer> {
=======

@Service
@CacheConfig( cacheNames = "supplier" )
public class SupplierService implements AbstractService<Supplier, Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private final SupplierDao supplierDao;

    @Autowired
    public SupplierService(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    public List<Supplier> findAll() {
        return supplierDao.findAll();
    }

    public Supplier findById(Integer id) {
        return supplierDao.getOne(id);
    }

    public Supplier persist(Supplier supplier) {
<<<<<<< HEAD
        if (supplier.getId() == null) {
            supplier.setItemSupplierStatus(ItemSupplierStatus.CURRENTLY_BUYING);
        }
=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
        return supplierDao.save(supplier);
    }

    public boolean delete(Integer id) {
        supplierDao.deleteById(id);
        return false;
    }

    public List<Supplier> search(Supplier supplier) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Supplier> supplierExample = Example.of(supplier, matcher);
        return supplierDao.findAll(supplierExample);
    }

<<<<<<< HEAD
    public Supplier lastSupplier() {
        return supplierDao.findFirstByOrderByIdDesc();
    }

    public Supplier findByIdAndItemSupplierStatus(Integer supplierId, ItemSupplierStatus itemSupplierStatus) {
    return supplierDao.findByIdAndItemSupplierStatus(supplierId,itemSupplierStatus);
    }
=======
    public Supplier lastSupplier(){
        return supplierDao.findFirstByOrderByIdDesc();
    }
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}