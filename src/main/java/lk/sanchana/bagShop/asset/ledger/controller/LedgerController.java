package lk.sanchana.bagShop.asset.ledger.controller;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.stream.Collectors;

@Controller
@RequestMapping( "/ledger" )
public class LedgerController {
    private final LedgerService ledgerService;
    private final DateTimeAgeService dateTimeAgeService;

    public LedgerController(LedgerService ledgerService, DateTimeAgeService dateTimeAgeService) {
        this.ledgerService = ledgerService;
        this.dateTimeAgeService = dateTimeAgeService;
    }

    //all ledgers
    @GetMapping
    public String findAllLed(Model model) {
        model.addAttribute("title", "All Items In Stock");
        model.addAttribute("ledgers", ledgerService.findAll());
        return "ledger/ledger";
    }

    //reorder point < item count
    @GetMapping( "/reorderPoint" )
    public String reorderPoint(Model model) {
        model.addAttribute("title", "Reorder Point Limit Exceeded");
        model.addAttribute("ledgers", ledgerService.findAll()
                .stream()
                .filter(x -> Integer.parseInt(x.getQuantity()) < Integer.parseInt(x.getItem().getRop()))
                .collect(Collectors.toList()));
        return "ledger/ledger";
    }

    //near expired date
    @PostMapping( "/expiredDate" )
    public String expiredDate(@RequestAttribute( "startDate" ) LocalDate startDate,
                              @RequestAttribute( "endDate" ) LocalDate endDate, Model model) {
        model.addAttribute("title", "All items on given date range start at " + startDate + " end at " + endDate);
        model.addAttribute("ledgers",
                           ledgerService.findByCreatedAtIsBetween(dateTimeAgeService.dateTimeToLocalDateStartInDay(startDate), dateTimeAgeService.dateTimeToLocalDateEndInDay(endDate)));

        return "ledger/ledger";
    }

    @GetMapping( "/{id}" )
    @ResponseBody
   /* public MappingJacksonValue findId(@PathVariable Integer id) {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(ledgerService.findById(id));
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter
                .filterOutAllExcept("id", "quantity", "item", "sellPrice");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("Ledger", simpleBeanPropertyFilter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }*/
    public Ledger find(@PathVariable Integer id){
        return ledgerService.findById(id);
=======


import lk.sanchana.bagShop.asset.ledger.entity.Ledger;
import lk.sanchana.bagShop.asset.ledger.service.LedgerService;
import lk.sanchana.bagShop.util.interfaces.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/ledger")
public  class LedgerController implements AbstractController<Ledger,Integer> {
    private final LedgerService ledgerService;

@Autowired
public LedgerController(LedgerService ledgerService) {
    this.ledgerService = ledgerService;
   /* this.makeAutoGenerateNumberService = makeAutoGenerateNumberService;
    this.emailService = emailService;
    this.twilioMessageService = twilioMessageService;*/
}

    @Override
    public String findAll(Model model) {
        return null;
    }

    @Override
    public String findById(Integer id, Model model) {
        return null;
    }

    @Override
    public String edit(Integer id, Model model) {
        return null;
    }

    @Override
    public String persist(@Valid Ledger ledger, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        return null;
    }

    @Override
    public String delete(Integer id, Model model) {
        return null;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    }
}
