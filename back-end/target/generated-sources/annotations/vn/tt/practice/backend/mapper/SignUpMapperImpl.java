package vn.tt.practice.backend.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vn.tt.practice.backend.dto.SignUpDTO;
import vn.tt.practice.backend.model.SignUp;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-28T15:58:15+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@Component
public class SignUpMapperImpl implements SignUpMapper {

    @Override
    public SignUpDTO toSignUpDTO(SignUp signUp) {
        if ( signUp == null ) {
            return null;
        }

        SignUpDTO.SignUpDTOBuilder signUpDTO = SignUpDTO.builder();

        signUpDTO.id( signUp.getId() );
        signUpDTO.firstName( signUp.getFirstName() );
        signUpDTO.lastName( signUp.getLastName() );
        signUpDTO.email( signUp.getEmail() );
        signUpDTO.password( signUp.getPassword() );

        return signUpDTO.build();
    }

    @Override
    public SignUp toSignUp(SignUpDTO signUpDTO) {
        if ( signUpDTO == null ) {
            return null;
        }

        SignUp.SignUpBuilder signUp = SignUp.builder();

        signUp.id( signUpDTO.getId() );
        signUp.firstName( signUpDTO.getFirstName() );
        signUp.lastName( signUpDTO.getLastName() );
        signUp.email( signUpDTO.getEmail() );
        signUp.password( signUpDTO.getPassword() );

        return signUp.build();
    }
}
