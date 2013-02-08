package org.ozoneplatform.example.impl;

import org.ozoneplatform.example.UserRepository;
import org.ozoneplatform.example.models.User;

public class UserRepositoryImpl extends GenericRepository<User> implements UserRepository {

    @Override
    public User getByUsername(String username) {
        throw new RuntimeException("Not implemented");
    }
}
