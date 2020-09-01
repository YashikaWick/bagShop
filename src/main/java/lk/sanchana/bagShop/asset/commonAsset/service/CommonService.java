package lk.sanchana.bagShop.asset.commonAsset.service;



<<<<<<< HEAD
=======
import lk.sanchana.bagShop.asset.employee.controller.EmployeeRestController;
import lk.sanchana.bagShop.asset.item.entity.Item;
import lk.sanchana.bagShop.asset.item.service.ItemService;
import lk.sanchana.bagShop.asset.supplier.entity.Enum.ItemSupplierStatus;
import lk.sanchana.bagShop.asset.supplier.entity.Supplier;
import lk.sanchana.bagShop.asset.supplier.entity.SupplierItem;
import lk.sanchana.bagShop.asset.supplier.service.SupplierItemService;
import lk.sanchana.bagShop.asset.supplier.service.SupplierService;
import lk.sanchana.bagShop.util.service.MakeAutoGenerateNumberService;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

@Service
public class CommonService {
    private final MakeAutoGenerateNumberService makeAutoGenerateNumberService;
    private final SupplierService supplierService;
    private final ItemService itemService;
    private final SupplierItemService supplierItemService;

    public CommonService(MakeAutoGenerateNumberService makeAutoGenerateNumberService, SupplierService supplierService, ItemService itemService, SupplierItemService supplierItemService) {
        this.makeAutoGenerateNumberService = makeAutoGenerateNumberService;
        this.supplierService = supplierService;
        this.itemService = itemService;
        this.supplierItemService = supplierItemService;
    }

<<<<<<< HEAD
    public List< Supplier > commonSupplierSearch(Supplier supplier) {
=======
    public List<Supplier> commonSupplierSearch(Supplier supplier) {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
        List<Supplier> suppliers;
        if (supplier.getContactOne() != null) {
            String contactNumber = makeAutoGenerateNumberService.phoneNumberLengthValidator(supplier.getContactOne());
//all match with supplier contact number one
            supplier.setContactOne(contactNumber);
            supplier.setContactTwo(null);
            suppliers = new ArrayList<>(supplierService.search(supplier));
//all match with contact number two
            supplier.setContactOne(null);
            supplier.setContactTwo(contactNumber);
            suppliers.addAll(supplierService.search(supplier));

        } else {
            suppliers = supplierService.search(supplier);
        }
        if (supplier.getContactOne() != null) {
            suppliers = suppliers.stream()
                    .filter(supplier1 ->
                            supplier.getContactOne().equals(supplier1.getContactTwo()) ||
                                    supplier.getContactOne().equals(supplier1.getContactOne()))
                    .collect(Collectors.toList());
        }
        return suppliers;
    }

    public String supplierItem(Supplier supplier, Model model, String htmlFileLocation) {
        List<Supplier> suppliers = commonSupplierSearch(supplier);

        model.addAttribute("searchAreaShow", false);

        if (suppliers.size() == 1) {
            model.addAttribute("supplierDetail", suppliers.get(0));
            return "redirect:/supplierItem/supplier/" + suppliers.get(0).getId();
        }
        model.addAttribute("suppliers", suppliers);
        model.addAttribute("supplierDetailShow", true);
        return htmlFileLocation;
    }

    public String purchaseOrder(Supplier supplier, Model model, String htmlFileLocation) {
        List<Supplier> suppliers = commonSupplierSearch(supplier);
<<<<<<< HEAD

        System.out.println(" i am here" + suppliers.size());

=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
        model.addAttribute("searchAreaShow", false);
        if (suppliers.size() == 1) {
            model.addAttribute("supplierDetail", suppliers.get(0));
            model.addAttribute("items", activeItemsFromSupplier(suppliers.get(0)));
            model.addAttribute("purchaseOrderItemEdit", false);
            return "redirect:/purchaseOrder/supplier/" + suppliers.get(0).getId();
        }
        model.addAttribute("suppliers", suppliers);
        model.addAttribute("supplierDetailShow", true);
        return htmlFileLocation;
    }

    public String supplierItem(Model model, Integer id) {
        model.addAttribute("searchAreaShow", false);
        model.addAttribute("supplierDetail", supplierService.findById(id));
        model.addAttribute("supplierDetailShow", false);
        model.addAttribute("items", itemService.findAll());
        return "supplier/addSupplierItem";
    }

    public String purchaseOrder(Model model, Integer id) {
        Supplier supplier = supplierService.findById(id);
        model.addAttribute("searchAreaShow", false);
        model.addAttribute("supplierDetail", supplier);
        model.addAttribute("items", activeItemsFromSupplier(supplier));
        model.addAttribute("supplierDetailShow", false);
        return "purchaseOrder/addPurchaseOrder";
    }

    public String commonMobileNumberLengthValidator(String mobileTwo) {
        return mobileTwo;
    }

<<<<<<< HEAD
    public List< Item > activeItemsFromSupplier(Supplier supplier) {
        List< SupplierItem > supplierItems = supplierItemService.findBySupplierAndItemSupplierStatus(supplier, ItemSupplierStatus.CURRENTLY_BUYING);
=======
    public List<Item> activeItemsFromSupplier(Supplier supplier) {
        List<SupplierItem> supplierItems = supplierItemService.findBySupplierAndItemSupplierStatus(supplier, ItemSupplierStatus.CURRENTLY_BUYING);
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
        List<Item> items = new ArrayList<>();
        for (SupplierItem supplierItem : supplierItems) {
            items.add(supplierItem.getItem());
        }
        return items;
    }

    //common things to employee and offender - start
    public void commonUrlBuilder(Model model) {
        model.addAttribute("addStatus", true);
        // model.addAttribute("designations", Designation.values());
/*        model.addAttribute("provinces", Province.values());
        model.addAttribute("districtUrl", MvcUriComponentsBuilder
                .fromMethodName(WorkingPlaceRestController.class, "getDistrict", "")
                .build()
                .toString());
        model.addAttribute("stationUrl", MvcUriComponentsBuilder
                .fromMethodName(WorkingPlaceRestController.class, "getStation", "")
                .build()
                .toString());*/
        Object[] arg = {"designation", "id"};
        model.addAttribute("employeeUrl", MvcUriComponentsBuilder
                .fromMethodName(EmployeeRestController.class, "getEmployeeByWorkingPlace", arg)
                .build()
                .toString());
    }
<<<<<<< HEAD


=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
}

