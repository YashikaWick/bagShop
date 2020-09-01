package lk.sanchana.bagShop.asset.customer.controller;


<<<<<<< HEAD

=======
import lk.sanchana.bagShop.asset.commonAsset.model.Enum.Title;
import lk.sanchana.bagShop.asset.customer.entity.Customer;
import lk.sanchana.bagShop.asset.customer.service.CustomerService;
import lk.sanchana.bagShop.util.interfaces.AbstractController;
import lk.sanchana.bagShop.util.service.EmailService;
import lk.sanchana.bagShop.util.service.MakeAutoGenerateNumberService;
import lk.sanchana.bagShop.util.service.TwilioMessageService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
<<<<<<< HEAD
public class CustomerController implements AbstractController< Customer, Integer> {
=======
public  class CustomerController implements AbstractController<Customer, Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private final CustomerService customerService;
    private final MakeAutoGenerateNumberService makeAutoGenerateNumberService;
    private final EmailService emailService;
    private final TwilioMessageService twilioMessageService;

<<<<<<< HEAD
=======
    @Autowired
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    public CustomerController(CustomerService customerService, MakeAutoGenerateNumberService makeAutoGenerateNumberService, EmailService emailService, TwilioMessageService twilioMessageService) {
        this.customerService = customerService;
        this.makeAutoGenerateNumberService = makeAutoGenerateNumberService;
        this.emailService = emailService;
        this.twilioMessageService = twilioMessageService;
    }

<<<<<<< HEAD

=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private String commonThings(Model model, Customer customer, Boolean addState) {
        model.addAttribute("title", Title.values());
        model.addAttribute("customer", customer);
        model.addAttribute("addStatus", addState);
        return "customer/addCustomer";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer/customer";
    }

<<<<<<< HEAD
=======
    @Override
    public String findById(Integer id, Model model) {
        return null;
    }

>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    @GetMapping("/add")
    public String addForm(Model model) {
        return commonThings(model, new Customer(), true);
    }

    @PostMapping(value = {"/save", "/update"})
    public String persist(Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            return commonThings(model, customer, true);
        }
//phone number length validator
<<<<<<< HEAD
        if (customer.getMobile() != null) {
            customer.setMobile(makeAutoGenerateNumberService.phoneNumberLengthValidator(customer.getMobile()));
        }
=======
        /*if (customer.getMobile() != null) {
            customer.setMobile(makeAutoGenerateNumberService.phoneNumberLengthValidator(customer.getMobile()));
        }*/
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

//if customer has id that customer is not a new customer
        if (customer.getId() == null) {
            //if there is not customer in db
            if (customerService.lastCustomer() == null) {
                System.out.println("last customer null");
<<<<<<< HEAD
                //need to generate new onecustomer
=======
                //need to generate new one
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
                customer.setCode("KMC"+makeAutoGenerateNumberService.numberAutoGen(null).toString());
            } else {
                System.out.println("last customer not null");
                //if there is customer in db need to get that customer's code and increase its value
                String previousCode = customerService.lastCustomer().getCode().substring(3);
                customer.setCode("KMC"+makeAutoGenerateNumberService.numberAutoGen(previousCode).toString());
            }
            //send welcome message and email
            if (customer.getEmail() != null) {
<<<<<<< HEAD
                //  emailService.sendEmail(customer.getEmail(), "Welcome Message", "Welcome to Kmart Super...");
            }
            if (customer.getMobile() != null) {
                //    twilioMessageService.sendSMS(customer.getMobile(), "Welcome to Kmart Super");
=======
              //  emailService.sendEmail(customer.getEmail(), "Welcome Message", "Welcome to Kmart Super...");
            }
            if (customer.getMobile() != null) {
            //    twilioMessageService.sendSMS(customer.getMobile(), "Welcome to Kmart Super");
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
            }
        }

        redirectAttributes.addFlashAttribute("customerDetail", customerService.persist(customer));
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        return commonThings(model, customerService.findById(id), false);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
        customerService.delete(id);
        return "redirect:/customer";
    }

    @GetMapping("/{id}")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("customerDetail", customerService.findById(id));
        return "customer/customer-detail";
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
