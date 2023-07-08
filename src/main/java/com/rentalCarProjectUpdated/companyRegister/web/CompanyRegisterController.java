package com.rentalCarProjectUpdated.companyRegister.web;

import com.rentalCarProjectUpdated.companyRegister.repository.CompanyRegisterRepository;
import com.rentalCarProjectUpdated.companyRegister.service.CompanyRegisterService;
import com.rentalCarProjectUpdated.companyRegister.service.dto.CompanyRegisterDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register2")
public class CompanyRegisterController {

    private final CompanyRegisterService companyRegisterService;
    private final CompanyRegisterRepository companyRegisterRepository;
    @Autowired
    public CompanyRegisterController(CompanyRegisterService companyRegisterService,
                                     CompanyRegisterRepository companyRegisterRepository){
        this.companyRegisterService = companyRegisterService;
        this.companyRegisterRepository = companyRegisterRepository;
    }

    @Schema(description = "Get Company Register List")
    @GetMapping("/getCompanyRegister")
    public ResponseEntity<List<CompanyRegisterDto>> getUserList(){
        List<CompanyRegisterDto> companyRegisterDtoList = this.companyRegisterService.getCompanyRegisterList();
        return  new ResponseEntity<>(companyRegisterDtoList, HttpStatus.OK);
    }

    @Schema(description = "Insert Company Register")
    @PostMapping("/postCompanyRegister")
    public ResponseEntity<CompanyRegisterDto>insertCompanyRegister(@RequestBody CompanyRegisterDto companyRegisterDto){
        companyRegisterDto = this.companyRegisterService.insertCompanyRegister(companyRegisterDto);
        return new ResponseEntity<>(companyRegisterDto,HttpStatus.OK);
    }
    @Schema(description = "Update Company Register")
    @PutMapping("/putCompanyRegister")
    public ResponseEntity<CompanyRegisterDto>updateCompanyRegister(@RequestBody CompanyRegisterDto companyRegisterDto){
        companyRegisterDto = this.companyRegisterService.updateCompanyRegister(companyRegisterDto);
        return new ResponseEntity<>(companyRegisterDto,HttpStatus.OK);
    }

    @Schema(description = "Delete Company")
    @DeleteMapping("/deleteCompanyRegister")
    public void removeCompanyRegister(@RequestParam("username") String username, @RequestParam("password") String password) {
        companyRegisterService.removeCompanyRegisterByUsernameAndPassword(username, password);
    }
}
