package gurpreet.project.taxibooking.service;

import gurpreet.project.taxibooking.dao.ContactFormCrud;
import gurpreet.project.taxibooking.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactFormServiceImpl implements ContactFormService {

    private ContactFormCrud contactFormCrud;
    @Autowired
    public void setContactFormCrud(ContactFormCrud contactFormCrud) {
        this.contactFormCrud = contactFormCrud;
    }

    @Override
    public ContactForm saveContactFormService(ContactForm contactForm) {
return contactFormCrud.save(contactForm);
    }
}
