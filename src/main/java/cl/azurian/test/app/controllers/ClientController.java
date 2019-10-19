package cl.azurian.test.app.controllers;

import cl.azurian.test.app.models.Client;
import cl.azurian.test.app.models.RequestClient;
import cl.azurian.test.app.service.ServiceClient;
import cl.azurian.test.app.service.ServiceClientImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findClient")
    @ResponseBody
    public Client findByRun(@RequestBody RequestClient requestClient){
        return serviceClient.findByRun(requestClient);
    }
}
