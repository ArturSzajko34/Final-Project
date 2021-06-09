package com.asz.FinalProject.rest;

import com.asz.FinalProject.rest.dto.ClientDTO;
import com.asz.FinalProject.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping("/client")
    public ClientDTO addClient(@RequestBody ClientDTO clientDTO) {
        return clientService.addClient(clientDTO);
    }

    @DeleteMapping("/client/{id}")
    public ResponseEntity deleteClient(@PathVariable(name = "id") Long id) {
        clientService.deleteClientById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/client/{id}")
    public ClientDTO editClient(@PathVariable(name = "id") Long id,
                                @RequestBody ClientDTO clientDTO) {
        return clientService.editClient(id, clientDTO);
    }
}