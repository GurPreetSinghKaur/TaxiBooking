package gurpreet.project.taxibooking.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "contactform")
public class ContactForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 30, message = "Invalid name size")
    @Column(length = 30)
 //  @Pattern(regexp = "[a-bA-B]")
    private String name;
    @NotEmpty
    @Size(min = 10, max = 15, message = "Invalid phone size")
    @Column(length = 15)
    private String phone;
//    @Min( value = 1000000000, message = "Phone number should be at least 10 digits")
//    @Min( value = 99999999999999L, message = "Phone number should not be  more than 15 digits")
//    private Long phone;
    @NotEmpty(message = "Email cannot be empty")
    @Size(min = 2, max = 30, message = "Invalid email size")
    @Column(length = 30)
    private String email;
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 500, message = "Invalid message size")
    @Column(length = 500)
    private String message;

}
