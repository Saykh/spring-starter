package com.dmdev;

import com.dmdev.database.pool.ConnectionPool;
import com.dmdev.repository.UserRepository;
import com.dmdev.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {

        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var userService = new UserService(userRepository);





    }
}
