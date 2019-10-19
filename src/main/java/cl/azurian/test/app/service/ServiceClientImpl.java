package cl.azurian.test.app.service;

import cl.azurian.test.app.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository
public class ServiceClientImpl implements ServiceClient {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Client> findAll() {
        List<Client> clients = entityManager.createQuery("from Client").getResultList();
        return clients;
    }


}
