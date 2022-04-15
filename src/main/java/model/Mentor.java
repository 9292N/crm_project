package model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public final class Mentor extends BaseEntity {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private LocalDate dob;
    private Double salary;

    @Builder
    public Mentor(Long id, LocalDateTime dateCreated, String firstName, String lastName, String phoneNumber, String email, LocalDate dob, Double salary) {
        super(id, dateCreated);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dob = dob;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", salary=" + salary +
                '}';
    }
}
