package gurpreet.project.taxibooking.model;
import jakarta.validation.constraints.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ContactForm {

    private int id;
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 30, message = "Invalid name size")
    @Pattern(regexp = "[a-bA-B]")
    private String name;
    @NotNull
    @Min( value = 1000000000, message = "Phone number should be at least 10 digits")
    @Min( value = 99999999999999L, message = "Phone number should not be  more than 15 digits")
    private Long phone;
    @NotEmpty(message = "Email cannot be empty")
    @Size(min = 2, max = 30, message = "Invalid email size")
    private String email;
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 500, message = "Invalid message size")
    private String message;

}
