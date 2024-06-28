package gurpreet.project.taxibooking.controller;

import gurpreet.project.taxibooking.model.BookingForm;
import gurpreet.project.taxibooking.model.ContactForm;
import gurpreet.project.taxibooking.service.ContactFormService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MyController {

    private ContactFormService contactFormService;
    @Autowired
    public void setContactFormService(ContactFormService contactFormService) {
        this.contactFormService = contactFormService;
    }

    @GetMapping(path = {"/","index", "home"})
    public String getHomePage(HttpServletRequest req, Model model) {
        String requestURI = req.getRequestURI();
        model.addAttribute("currentPage",requestURI);
        model.addAttribute("bookingForm", new BookingForm());
        return "index";}


@PostMapping("bookingform")
  public String bookingForm(@Valid @ModelAttribute BookingForm bookingForm, BindingResult bindingResult,
                              Model model, RedirectAttributes redirectAttributes){
        System.out.println(bookingForm);
   if (bindingResult.hasErrors()) {
       model.addAttribute("bindingResult",bindingResult);
//       System.out.println(bindingResult);
       return "index";
   } else if (bookingForm.getAdult() + bookingForm.getChild() > 8) {
       model.addAttribute("message","Adults and children cannot be greater than 8 altogether");
       return "index";
   }

        return "redirect:/index";
    }







    @GetMapping("about")
    public String getAboutPage(HttpServletRequest req, Model model) {
        String requestURI = req.getRequestURI();
        model.addAttribute("currentPage",requestURI);
        return "about";}
    @GetMapping("cars")
    public String getCarPage(HttpServletRequest req, Model model) {
        String requestURI = req.getRequestURI();
        model.addAttribute("currentPage",requestURI);return "cars";}
    @GetMapping("services")
    public String getServicesPage(HttpServletRequest req, Model model) {
        String requestURI = req.getRequestURI();
        model.addAttribute("currentPage",requestURI);return "services";}

    @GetMapping("contacts")
    public String getContactsPage(HttpServletRequest req, Model model) {
        String requestURI = req.getRequestURI();

        model.addAttribute("currentPage", requestURI);
        model.addAttribute("contactForm", new ContactForm());
        return "contacts";
    }

   @PostMapping("contactform")
    public String contactForm(@Valid @ModelAttribute ContactForm contactForm, BindingResult bindingResult,
                              Model model, RedirectAttributes redirectAttributes){
        System.out.println(contactForm);
   if (bindingResult.hasErrors()) {
       model.addAttribute("bindingResult",bindingResult);
//       System.out.println(bindingResult);
       return "contacts";
   }

  ContactForm saveContactFormService = contactFormService.saveContactFormService(contactForm);
    if (saveContactFormService != null) {
        redirectAttributes.addFlashAttribute("message", "Message saved successfully");
    } else {
        redirectAttributes.addFlashAttribute("message", "Error sending message ");
    }

        return "redirect:/contacts";

    }

}
