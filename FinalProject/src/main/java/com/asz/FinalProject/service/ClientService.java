package com.asz.FinalProject.service;

import com.asz.FinalProject.entities.AddressEntity;
import com.asz.FinalProject.entities.ClientEntity;
import com.asz.FinalProject.repositories.AddressRepository;
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
    private final AddressRepository addressRepository;

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
            addressRepository.deleteById(id);
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
}
