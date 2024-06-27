package gurpreet.project.taxibooking.dao;

import gurpreet.project.taxibooking.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactFormCrud extends JpaRepository <ContactForm, Integer> {
    @Override
    public < S extends ContactForm> S save(S contactForm);

}
