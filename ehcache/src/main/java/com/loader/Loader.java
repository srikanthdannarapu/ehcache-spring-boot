package com.loader;
import com.cache.UsersCache;
import com.model.Users;
import com.repository.UsersRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {
	private static final Logger log = LoggerFactory.getLogger(Loader.class);

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    public void load() {
    	log.info("*_* loading dummy hardcoded users");
        List<Users> usersList = getList();
        usersRepository.saveAll(usersList);
    }

    public List<Users> getList() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("Srikanth", "Java",123L));
        usersList.add(new Users("Dannarapu", "UI",13L));
        return usersList;
    }
}