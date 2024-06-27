package gurpreet.project.taxibooking.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @GetMapping(path = {"/","index", "home"})
    public String getHomePage(HttpServletRequest req, Model model) {
        String requestURI = req.getRequestURI();
        model.addAttribute("currentPage",requestURI);
        return "index";}
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
        model.addAttribute("currentPage",requestURI);return "contacts";}

   @PostMapping("contactForm")
    public String contactForm(Model model){
        return "";

    }

}
