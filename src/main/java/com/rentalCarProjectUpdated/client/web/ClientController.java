package com.rentalCarProjectUpdated.client.web;

import com.rentalCarProjectUpdated.client.repository.ClientRepository;
import com.rentalCarProjectUpdated.client.service.ClientService;
import com.rentalCarProjectUpdated.client.service.dto.ClientDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name= "Client Controller")
@RequestMapping("/client")
@RestController
public class ClientController {

    private final ClientService clientService;
    private final ClientRepository clientRepository;
    @Autowired
    public ClientController(ClientService clientService ,
                            ClientRepository clientRepository){
        this.clientService = clientService;
        this.clientRepository = clientRepository;
    }

    // CRUD İŞLEMLERİ YAPTIĞIMIZ CLASS!!

    @Schema(description = "Get Client List")
    @GetMapping("/getClient")
    public ResponseEntity<List<ClientDto>> getUserList(){
        List<ClientDto> userAdminDtoList = this.clientService.getClients();
        return  new ResponseEntity<>(userAdminDtoList, HttpStatus.OK);
    }

    @Schema(description = "Insert Client")
    @PostMapping("/postClient")
    public ResponseEntity<ClientDto>insertUser(@RequestBody ClientDto userAdminDto){
        userAdminDto = this.clientService.insertClient(userAdminDto);
        return new ResponseEntity<>(userAdminDto,HttpStatus.OK);
    }
    @Schema(description = "Delete Client")
    @DeleteMapping("/deleteClient")
    public void removeUser(Long id){
        this.clientService.removeClient(id);
    }

    @Schema(description = "Update Client")
    @PutMapping("/putClient")
    public ResponseEntity<ClientDto>updateUser(@RequestBody ClientDto userAdminDto){
        userAdminDto = this.clientService.updateClient(userAdminDto);
        return new ResponseEntity<>(userAdminDto,HttpStatus.OK);
    }
}
