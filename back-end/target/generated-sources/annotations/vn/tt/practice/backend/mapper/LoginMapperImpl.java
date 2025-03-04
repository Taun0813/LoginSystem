package vn.tt.practice.backend.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vn.tt.practice.backend.dto.LoginDTO;
import vn.tt.practice.backend.model.Login;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-28T15:58:15+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@Component
public class LoginMapperImpl implements LoginMapper {

    @Override
    public LoginDTO toLoginDTO(Login login) {
        if ( login == null ) {
            return null;
        }

        LoginDTO.LoginDTOBuilder loginDTO = LoginDTO.builder();

        loginDTO.id( login.getId() );
        loginDTO.username( login.getUsername() );
        loginDTO.password( login.getPassword() );

        return loginDTO.build();
    }

    @Override
    public Login toLogin(LoginDTO loginDTO) {
        if ( loginDTO == null ) {
            return null;
        }

        Login login = new Login();

        login.setId( loginDTO.getId() );
        login.setUsername( loginDTO.getUsername() );
        login.setPassword( loginDTO.getPassword() );

        return login;
    }
}
