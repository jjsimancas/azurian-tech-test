package cl.azurian.test.app.controllers;

import cl.azurian.test.app.models.Client;
import cl.azurian.test.app.service.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/azurian")
public class ClientController {

    @Autowired
    private ServiceClient serviceClient;

    @GetMapping("/findClients")
    @ResponseBody
    public List<Client> findAll(){
        return serviceClient.findAll();
    }
}
