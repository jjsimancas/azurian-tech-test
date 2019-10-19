package cl.azurian.test.app.service;

import cl.azurian.test.app.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServiceClient {

    List<Client> findAll();
}
