package org.hirun.web.service;

import org.hirun.web.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User get() {
        return new User("이경태", 28);
    }
}
