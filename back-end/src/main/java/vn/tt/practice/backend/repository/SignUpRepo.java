package vn.tt.practice.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.tt.practice.backend.model.SignUp;

public interface SignUpRepo extends MongoRepository<SignUp, String> {
    boolean existsByEmail(String email);
    boolean existsByPassword(String password);
}
