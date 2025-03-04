package vn.tt.practice.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
