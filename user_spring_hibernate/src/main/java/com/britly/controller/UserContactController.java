package com.britly.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.britly.model.UserAddress;
import com.britly.model.Users;
import com.britly.model.UsersContact;
import com.britly.repository.UsersContactRepository;

@RequestMapping("/rest/userscontact")
@RestController
public class UserContactController {

	private UsersContactRepository usersContactRepository;

    public UserContactController(UsersContactRepository usersContactRepository) {
        this.usersContactRepository = usersContactRepository;
    }

    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact() {
        return usersContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<UsersContact> update(@PathVariable final String name) {

        UsersContact usersContact = new UsersContact();
        UserAddress address = new UserAddress();
        address.setCity("Chennai");
        
        UserAddress address1 = new UserAddress();
        address.setCity("Mumbai");
        
        
        Users users = new Users();
        users.setTeamName("Development")
                .setSalary(10000)
                .setName(name)
                .setUsersLogs(Arrays.asList(address,address1));;


        usersContact.setPhoneNo(11111)
                .setUsers(users);

        usersContactRepository.save(usersContact);

        return usersContactRepository.findAll();


    }

}
