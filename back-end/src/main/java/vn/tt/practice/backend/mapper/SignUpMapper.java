package vn.tt.practice.backend.mapper;

import org.mapstruct.Mapper;
import vn.tt.practice.backend.dto.SignUpDTO;
import vn.tt.practice.backend.model.SignUp;

@Mapper(componentModel = "spring")
public interface SignUpMapper {
    SignUpDTO toSignUpDTO(SignUp signUp);
    SignUp toSignUp(SignUpDTO signUpDTO);
}
