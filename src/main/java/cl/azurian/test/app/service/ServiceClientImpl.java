package cl.azurian.test.app.service;

import cl.azurian.test.app.models.Client;
import cl.azurian.test.app.models.RequestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ServiceClientImpl implements ServiceClient {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Client> findAll() {
        List<Client> clients = entityManager.createQuery("from Client").getResultList();
        return clients;
    }

    @Override
    public Client findByRun(RequestClient requestClient) {
        Client client = entityManager.find(Client.class, requestClient.getRun());
        return client;
    }
}
