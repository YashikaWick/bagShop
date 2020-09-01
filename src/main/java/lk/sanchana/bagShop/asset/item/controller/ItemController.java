package lk.sanchana.bagShop.asset.item.controller;


<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping( "/item" )
public class ItemController implements AbstractController< Item, Integer > {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    private String commonThings(Model model, Item item, Boolean addState) {
        model.addAttribute("itemStatuses", ItemStatus.values());
        model.addAttribute("item", item);
        model.addAttribute("addStatus", addState);
        model.addAttribute("mainCategories", MainCategory.values());
        model.addAttribute("urlMainCategory", MvcUriComponentsBuilder
                .fromMethodName(CategoryController.class, "getCategoryByMainCategory", "")
=======
import lk.sanchana.bagShop.asset.item.brand.service.BrandService;
import lk.sanchana.bagShop.asset.item.category.controller.CategoryRestController;
import lk.sanchana.bagShop.asset.item.color.service.ItemColorService;
import lk.sanchana.bagShop.asset.item.entity.Enum.ItemSize;
import lk.sanchana.bagShop.asset.item.entity.Enum.ItemStatus;
import lk.sanchana.bagShop.asset.item.entity.Enum.MainCategory;
import lk.sanchana.bagShop.asset.item.entity.Item;
import lk.sanchana.bagShop.asset.item.service.ItemService;
import lk.sanchana.bagShop.util.interfaces.AbstractController;
import lk.sanchana.bagShop.util.service.MakeAutoGenerateNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/item")
public class ItemController implements AbstractController<Item, Integer> {
    private final ItemService itemService;
    private final BrandService brandService;
    private final MakeAutoGenerateNumberService makeAutoGenerateNumberService;
    private final ItemColorService itemColorService;

    @Autowired
    public ItemController(ItemService itemService, BrandService brandService, MakeAutoGenerateNumberService makeAutoGenerateNumberService, ItemColorService itemColorService) {
        this.itemService = itemService;
        this.brandService = brandService;
        this.makeAutoGenerateNumberService = makeAutoGenerateNumberService;
        this.itemColorService = itemColorService;
    }

    private String commonThings(Model model, Item item, Boolean addState) {
        model.addAttribute("statuses", ItemStatus.values());
        model.addAttribute("item", item);
        model.addAttribute("addStatus", addState);
        model.addAttribute("mainCategories", MainCategory.values());
        model.addAttribute("itemSizes", ItemSize.values());
        model.addAttribute("brands", brandService.findAll());
        model.addAttribute("itemColors", itemColorService.findAll());
        model.addAttribute("urlMainCategory", MvcUriComponentsBuilder
                .fromMethodName(CategoryRestController.class, "getCategoryByMainCategory", "")
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
                .build()
                .toString());
        return "item/addItem";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("items", itemService.findAll());
        return "item/item";
    }

<<<<<<< HEAD
    @GetMapping( "/add" )
=======
    @Override
    public String findById(Integer id, Model model) {
        return null;
    }

    @GetMapping("/add")
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public String addForm(Model model) {
        return commonThings(model, new Item(), true);
    }

<<<<<<< HEAD
    @PostMapping( value = {"/save", "/update"} )
    public String persist(@Valid @ModelAttribute Item item, BindingResult bindingResult,
                          RedirectAttributes redirectAttributes, Model model) {
        if ( bindingResult.hasErrors() ) {
            return commonThings(model, item, true);
        }

        if ( item.getId() == null ) {
            //item code => MainCategory first two letters + category first two letters + price
            item.setCode(item.getCategory().getMainCategory() + item.getCategory().getName().substring(0, 2) + item.getSellPrice());
        } else if ( !itemService.findById(item.getId()).getSellPrice().equals(item.getSellPrice()) ) {
            item.setCode(item.getCategory().getMainCategory() + item.getCategory().getName().substring(0, 2) + item.getSellPrice());
        }
=======
    @PostMapping(value = {"/save", "/update"})
    public String persist(Item item, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            return commonThings(model, item, true);
        }
        /*if (item.getId() == null) {
            //if there is not item in db
            if (itemService.lastItem() == null) {
                System.out.println("last item null");
                //need to generate new one
                item.setCode("KMC"+makeAutoGenerateNumberService.numberAutoGen(null).toString());
            } else {
                System.out.println("last item not null");
                //if there is item in db need to get that item's code and increase its value
                String previousCode = itemService.lastItem().getCode().substring(3);
                item.setCode("KMC"+makeAutoGenerateNumberService.numberAutoGen(previousCode).toString());
            }
        }*/
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

        itemService.persist(item);
        return "redirect:/item";
    }

<<<<<<< HEAD
    @GetMapping( "/edit/{id}" )
=======
    @GetMapping("/edit/{id}")
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public String edit(@PathVariable Integer id, Model model) {
        return commonThings(model, itemService.findById(id), false);
    }

<<<<<<< HEAD
    @GetMapping( "/delete/{id}" )
=======
    @GetMapping("/delete/{id}")
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public String delete(@PathVariable Integer id, Model model) {
        itemService.delete(id);
        return "redirect:/item";
    }

<<<<<<< HEAD
    @GetMapping( "/{id}" )
=======
    @GetMapping("/{id}")
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("itemDetail", itemService.findById(id));
        return "item/item-detail";
    }
<<<<<<< HEAD

}
=======
}
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
