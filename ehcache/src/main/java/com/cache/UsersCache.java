package com.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.model.Users;
import com.repository.UsersRepository;

@Component
public class UsersCache {
	private static final Logger log = LoggerFactory.getLogger(UsersCache.class);

    @Autowired
    UsersRepository usersRepository;

    @Cacheable(value = "usersCache", key = "#name")
    public Users getUser(String name) {
        log.info("Retrieving from Database for name: " + name);
        return usersRepository.findByName(name);
    }
}