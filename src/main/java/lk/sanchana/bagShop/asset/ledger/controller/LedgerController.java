package lk.sanchana.bagShop.asset.ledger.controller;



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
    }
}
