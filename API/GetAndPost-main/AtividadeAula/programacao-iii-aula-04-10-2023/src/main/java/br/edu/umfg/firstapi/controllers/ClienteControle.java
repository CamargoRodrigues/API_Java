package br.edu.umfg.firstapi.controllers;

import br.edu.umfg.entities.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteControle {

    private List<Cliente> list = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Cliente>> getClients() {

        return ResponseEntity.ok(list);
    }


    @PostMapping
    public ResponseEntity<Cliente> postClient(@RequestBody Cliente client) {
        list.add(client);
        return ResponseEntity.ok(client);
    }
}
