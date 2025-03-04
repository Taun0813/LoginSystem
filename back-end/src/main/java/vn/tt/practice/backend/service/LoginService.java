package vn.tt.practice.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.tt.practice.backend.dto.LoginDTO;
import vn.tt.practice.backend.repository.SignUpRepo;

@AllArgsConstructor
@Service
public class LoginService {
    private final SignUpRepo signUpRepo;

    public String login(LoginDTO data) {

        if (signUpRepo.existsByEmail(data.getUsername()) &&
            signUpRepo.existsByPassword(data.getPassword()))
        {
            return ("Login Successful");
        }else return ("Wrong email or password");

    }
}
