package org.ozoneplatform.example;

import org.ozoneplatform.example.models.User;

public interface UserRepository extends Repository<User> {

    User getByUsername(String username);
}
