package vn.tt.practice.backend.mapper;


import org.mapstruct.Mapper;
import vn.tt.practice.backend.dto.LoginDTO;
import vn.tt.practice.backend.model.Login;

@Mapper(componentModel = "spring")
public interface LoginMapper {
    LoginDTO toLoginDTO(Login login);
    Login toLogin(LoginDTO loginDTO);
}
