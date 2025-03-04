package vn.tt.practice.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vn.tt.practice.backend.dto.SignUpDTO;
import vn.tt.practice.backend.mapper.SignUpMapper;
import vn.tt.practice.backend.repository.SignUpRepo;


@Service
@RequiredArgsConstructor
public class SignUpService {
    private final SignUpMapper signUpMapper;
    private final SignUpRepo signUpRepo;
    private final EmailService emailService;
    private final PasswordEncoder passwordEncoder;

    public String save(SignUpDTO request) {
        if (signUpRepo.existsByEmail(request.getEmail())) {
            return "Email is already in use";
        }
        SignUpDTO data = SignUpDTO.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
        signUpRepo.save(signUpMapper.toSignUp(data));
        emailService.sendEmail(request.getEmail());
        return "Registration is successful, check your email";
    }



}
