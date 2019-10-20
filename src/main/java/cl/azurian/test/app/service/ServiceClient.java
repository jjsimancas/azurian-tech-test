package cl.azurian.test.app.service;

import cl.azurian.test.app.models.Client;

import java.util.List;

public interface ServiceClient {

    List<Client> findAll();
}
