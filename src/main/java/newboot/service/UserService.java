package newboot.service;


import newboot.model.User;


import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void save(User user);
    void delete(Long id);
    void edit(Long id, User user);
    User getById(Long id);
}
