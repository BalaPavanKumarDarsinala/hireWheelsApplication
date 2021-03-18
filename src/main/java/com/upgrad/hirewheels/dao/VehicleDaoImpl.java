package com.upgrad.hirewheels.dao;
import java.util.List;

import javax.persistence.EntityManager;

import com.upgrad.hirewheels.entities.Vehicle;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class VehicleDaoImpl {
    // define field for entitymanager
    @Autowired
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public VehicleDaoImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Transactional
    public List<Vehicle> findAll() {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query<Vehicle> theQuery =
                currentSession.createQuery("from Vehicle", Vehicle.class);

        // execute query and get result list
        List<Vehicle> vehicles = theQuery.getResultList();

        // return the results
        return vehicles;
    }

}


