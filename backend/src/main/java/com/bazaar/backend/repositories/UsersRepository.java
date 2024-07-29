package com.bazaar.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bazaar.backend.models.User;

@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {

    
} 