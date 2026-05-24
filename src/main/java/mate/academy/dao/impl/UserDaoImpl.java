package mate.academy.dao.impl;

import mate.academy.dao.UserDao;
import mate.academy.model.User;
import org.hibernate.SessionFactory;

import java.util.Optional;

public class UserDaoImpl implements UserDao {

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
