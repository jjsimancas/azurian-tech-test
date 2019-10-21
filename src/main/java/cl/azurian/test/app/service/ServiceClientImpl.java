package cl.azurian.test.app.service;

import cl.azurian.test.app.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class ServiceClientImpl implements ServiceClient {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Client> findAll() {
        List<Client> clients = entityManager.createQuery("from Client").getResultList();
        return clients;
    }


}
