package rs.edu.raf.userservice.domain.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPostPutDto {
    //kada pravimo novog
    //kada update-ujemo postojeceg
    private String firstName;
    private String lastName;
    private String jmbg;
    private String dateOfBirth;
    private String gender;
    private String address;
    @Size(min = 9, max = 10)
    private String phoneNumber;
    @Email
    private String email;
}
