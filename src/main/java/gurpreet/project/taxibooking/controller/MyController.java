package gurpreet.project.taxibooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MyController {
    @GetMapping(path = {"","home","welcome","index"})
    public String getHomePage() {return "index";}
    @GetMapping("about")
    public String getAboutPage() {return "about";}
    @GetMapping("cars")
    public String getCarPage() {return "cars";}
    @GetMapping("services")
    public String getServicesPage() {return "services";}
    @GetMapping("contacts")
    public String getContactsPage() {return "contacts";}

}
