package vn.tt.practice.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.tt.practice.backend.model.Login;

public interface LoginRepo extends MongoRepository<Login, String> {

}
