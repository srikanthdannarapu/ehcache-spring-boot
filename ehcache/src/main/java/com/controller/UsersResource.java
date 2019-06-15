package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cache.UsersCache;
import com.model.Users;

@RestController
public class UsersResource {

    @Autowired
    UsersCache usersCache;

    @GetMapping(value = "/{name}")
    public Users getUser(@PathVariable final String name) {
        return usersCache.getUser(name);
    }
}