package com.rentalCarProjectUpdated.clientRegister.web;

import com.rentalCarProjectUpdated.clientRegister.repository.ClientRegisterRepository;
import com.rentalCarProjectUpdated.clientRegister.service.ClientRegisterService;
import com.rentalCarProjectUpdated.clientRegister.service.dto.ClientRegisterDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class ClientRegisterController {

    private final ClientRegisterService clientRegisterService;
    private final ClientRegisterRepository clientRegisterRepository;
    @Autowired
    public ClientRegisterController(ClientRegisterService clientRegisterService ,
                                    ClientRegisterRepository clientRegisterRepository){
        this.clientRegisterService = clientRegisterService;
        this.clientRegisterRepository = clientRegisterRepository;
    }

    @Schema(description = "Get Client Register List")
    @GetMapping("/getClientRegister")
    public ResponseEntity<List<ClientRegisterDto>> getUserList(){
        List<ClientRegisterDto> clientRegisterDtoList = this.clientRegisterService.getClientRegisterList();
        return  new ResponseEntity<>(clientRegisterDtoList, HttpStatus.OK);
    }

    @Schema(description = "Insert Client Register")
    @PostMapping("/postClientRegister")
    public ResponseEntity<ClientRegisterDto>insertClientRegister(@RequestBody ClientRegisterDto clientRegisterDto){
        clientRegisterDto = this.clientRegisterService.insertClientRegister(clientRegisterDto);
        return new ResponseEntity<>(clientRegisterDto,HttpStatus.OK);
    }
    @Schema(description = "Update Client Register")
    @PutMapping("/putClientRegister")
    public ResponseEntity<ClientRegisterDto>updateClientRegister(@RequestBody ClientRegisterDto clientRegisterDto){
        clientRegisterDto = this.clientRegisterService.updateClientRegister(clientRegisterDto);
        return new ResponseEntity<>(clientRegisterDto,HttpStatus.OK);
    }

    @Schema(description = "Delete Client")
    @DeleteMapping("/deleteClientRegister")
    public void removeClientRegister(@RequestParam("username") String username, @RequestParam("password") String password) {
        clientRegisterService.removeClientRegisterByUsernameAndPassword(username, password);
    }
}
