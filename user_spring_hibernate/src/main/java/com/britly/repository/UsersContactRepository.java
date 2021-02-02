package com.britly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.britly.model.UsersContact;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> 
{
	
}
