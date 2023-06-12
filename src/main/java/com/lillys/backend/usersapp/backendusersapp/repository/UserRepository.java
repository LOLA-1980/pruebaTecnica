package com.lillys.backend.usersapp.backendusersapp.repository;

import com.lillys.backend.usersapp.backendusersapp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>  {

}
