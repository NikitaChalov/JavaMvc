package org.chalov.lessStud.DAO.impl;

import org.chalov.lessStud.DAO.UserDAO;
import org.chalov.lessStud.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HibernateUserDAO implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){ return sessionFactory.openSession();}
    @Override
    public List<User> getAll(){
       List<User> users = (List<User>) currentSession().createQuery("from User").list();
        return users;
    }

    @Override
    public User getOne(String email) {
        Query<User> q = currentSession().createQuery("from User where email=:em");
        q.setParameter("em",email);
        return q.list().stream().findAny().orElse(null);
    }

    @Override
    public void add(User user) {
        currentSession().save(user);
    }
}
