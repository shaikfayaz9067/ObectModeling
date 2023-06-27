package com.crio.codingame.repositories;

// import java.util.List;
import java.util.Optional;

import com.crio.codingame.entities.User;

public interface IUserRepository extends CRUDRepository<User,String> {
    public Optional<User> findByName(String name);

    public void deleteByUserName(String userName); 
    // public Optional<User> findByName(String name); 
}
