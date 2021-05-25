package com.asz.FinalProject.service;

import com.asz.FinalProject.entities.ClientEntity;
import com.asz.FinalProject.repositories.ClientRepository;
import com.asz.FinalProject.rest.dto.ClientDTO;
import com.asz.FinalProject.util.EntityDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientDTO addClient(ClientDTO clientDTO) {
        ClientEntity clientEntity = EntityDtoMapper.mapClientToEntity(clientDTO);
        ClientEntity save = clientRepository.save(clientEntity);
        return EntityDtoMapper.mapClientToDTO(save);
    }

}
