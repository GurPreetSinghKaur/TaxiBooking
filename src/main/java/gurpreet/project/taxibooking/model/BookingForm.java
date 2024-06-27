package gurpreet.project.taxibooking.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookingForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name cannot be empty")
    @NotBlank(message = "Name cannot be blank")
    @Size(min=2, max = 30, message = "Invalid name length")
    @Pattern(regexp = "[^0-1]", message = "Name should only contain alphabets")
    private String name;

    @NotBlank(message = "Email cannot be blank")
    @NotEmpty(message = "Email cannot be empty")
    @Size(min=2, max = 30, message = "Invalid email length")
    private String email;

    @NotBlank(message = "Pickup cannot be blank")
    @NotEmpty(message = "Pickup location cannot be empty")
    @Size(min=2, max = 100, message = "Invalid location length")
    private String from;

    @NotBlank(message = "Destination cannot be blank")
    @NotEmpty(message = "Destination cannot be empty")
    @Size(min=2, max = 100, message = "Invalid destination length")
    private String to;

    @NotBlank(message = "Message cannot be blank")
    @NotEmpty(message = "Message cannot be empty")
    private String message;

    @NotNull(message = "Name cannot be empty")
    private LocalDate date;

    @NotNull(message = "Name cannot be empty")
    private LocalTime time;

    @Size(min=2, max = 30, message = "Invalid comfort length")
    @NotEmpty(message = "comfort cannot be empty")
    private String comfort;

    @Min(value = 1, message = "At least one adult is required")
    @Max(value = 8)
    private int adult;

    @Min(value = 0)
    @Max(value = 5)
    private int child;
}
