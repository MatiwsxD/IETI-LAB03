package edu.eci.ieti.repository;

import edu.eci.ieti.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface UserRepository extends MongoRepository<User,String> {
    List<User> findByName(String queryText);
    List<User> findByLastName(String queryText);
    List<User> findBycreatedAtAfter(Date startDate);
    User findByEmail(String email);
}
