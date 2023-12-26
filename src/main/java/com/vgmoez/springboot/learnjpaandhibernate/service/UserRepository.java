package com.vgmoez.springboot.learnjpaandhibernate.service;

import com.vgmoez.springboot.learnjpaandhibernate.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser, Long> {

}
