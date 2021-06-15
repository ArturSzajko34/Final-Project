package com.asz.FinalProject.service;

import com.asz.FinalProject.entities.AddressEntity;
import com.asz.FinalProject.entities.ClientEntity;
import com.asz.FinalProject.repositories.ClientRepository;
import com.asz.FinalProject.rest.dto.ClientDTO;
import com.asz.FinalProject.util.EntityDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientDTO addClient(ClientDTO clientDTO) {
        ClientEntity clientEntity = EntityDtoMapper.mapClientToEntity(clientDTO); //get client
        AddressEntity addressEntity = EntityDtoMapper.mapToAddressToEntity(clientDTO.getAddress()); // get address in client object
        clientEntity.setAddressEntity(addressEntity);
        addressEntity.setClientEntity(clientEntity);
        ClientEntity save = clientRepository.save(clientEntity); // save client and address in base
        return EntityDtoMapper.mapClientToDTO(save);//return in postman added client
    }

    public void deleteClientById(Long id) {
        if (validationIfTheClientExists(id)) {
            clientRepository.deleteById(id);
        }
    }

    public boolean validationIfTheClientExists(Long id) {
        Optional<ClientEntity> clientById = clientRepository.findById(id);
        if (clientById.isPresent()) {
            return true;
        } else {
            throw new IllegalArgumentException("does not exist id: " + id);
        }
    }

    public ClientDTO editClient(Long id, ClientDTO clientDTO) {
        Optional<ClientEntity> optionalClient = clientRepository.findById(id);
        if (optionalClient.isPresent()) {
            ClientEntity clientEntity = optionalClient.get();
            clientEntity.setName(clientDTO.getName());
            clientEntity.getAddressEntity().setCity(clientDTO.getAddress().getCity());
            clientEntity.getAddressEntity().setCountry(clientDTO.getAddress().getCountry());
            ClientEntity save = clientRepository.save(clientEntity);
            return EntityDtoMapper.mapClientToDTO(save);
        }
            //TODO jak zwrócic adres
        else{
            ClientEntity clientEntity1 = EntityDtoMapper.mapClientToEntity(clientDTO);
            ClientEntity save = clientRepository.save(clientEntity1);
            return EntityDtoMapper.mapClientToDTO(save);
        }
    }
}
