package edu.eci.ieti.service;

import edu.eci.ieti.entities.User;
import edu.eci.ieti.dto.UserDto;

import java.util.Date;
import java.util.List;

public interface UserService {
    User create(User user );
    User findById(String id );
    List<User> getAll();
    void deleteById( String id );
    User update(UserDto userdto, String userId );
    List<User> findUsersWithNaeOrLastNameLike(String queryText);
    List<User> findUsersCreatedAfter(Date startDate);
    User findByEmail(String email);
}