package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

@Repository
public abstract class UsersDaoImpl implements UsersDao {
    private SessionFactory sessionFactory;


    public UsersDaoImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public Users save(Users users) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(users);
session.remove(users);
        transaction.commit();
        session.close();

        return users;
    }


    public Users findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Users users = session.get(Users.class, id);

        transaction.commit();
        session.close();

        return users;
    }


    public List <Users> findByFirstName(String firstName) {
        return null;
    }


    public Users update(Users users) {
        return null;
    }


    @Override
    public List <Users> findAll() {
        return null;
    }

    @Override
    public List <Users> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page <Users> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List <Users> findAllById(Iterable <Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Users users) {

    }

    @Override
    public void deleteAll(Iterable <? extends Users> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Users> List <S> saveAll(Iterable <S> iterable) {
        return null;
    }

    @Override
    public Optional <Users> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Users> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable <Users> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Users getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Users> Optional <S> findOne(Example <S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Users> List <S> findAll(Example <S> example) {
        return null;
    }

    @Override
    public <S extends Users> List <S> findAll(Example <S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Users> Page <S> findAll(Example <S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Users> long count(Example <S> example) {
        return 0;
    }

    @Override
    public <S extends Users> boolean exists(Example <S> example) {
        return false;
    }
}






