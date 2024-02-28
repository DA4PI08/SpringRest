package com.springrest.repository;

import com.springrest.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface usersRepo extends JpaRepository<Users, String> {

    Users findByFirstName(String name);
    Pageable findByUserType(Pageable pageable);
    List<Users> findByFirm(String firm);
    Pageable findByFirm(String firm, Pageable pageable);
}
