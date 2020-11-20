package web.dao;

import org.springframework.security.core.userdetails.UserDetails;
import web.model.User;

import java.util.List;

public interface UserDao {
   List<User> listAllUsers();
   void add(User user);
   void delete(int id);
   User showUser (int id);
   List<User> findUserByUsername(String username);
   User getUserByName(String name);
}
