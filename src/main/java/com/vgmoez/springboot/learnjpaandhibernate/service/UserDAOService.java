package com.vgmoez.springboot.learnjpaandhibernate.service;


import com.vgmoez.springboot.learnjpaandhibernate.entity.MyUser;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(MyUser user){
        entityManager.persist(user);
        return user.getId();
    }


}
