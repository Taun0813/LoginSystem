package vn.tt.practice.backend.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    public final JavaMailSender mailSender ;

    public void sendEmail(String to) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject("Testing");
            message.setText("testing email");

            mailSender.send(message);
        }catch (Exception e) {
            throw new RuntimeException("Error sending email", e);
        }
    }
}
