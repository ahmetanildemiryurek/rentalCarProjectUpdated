package com.rentalCarProjectUpdated.company.web.controller;
import com.rentalCarProjectUpdated.company.domain.Company;
import com.rentalCarProjectUpdated.company.service.CompanyService;
import com.rentalCarProjectUpdated.company.service.dto.CompanyDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name= "Company Controller")
@RequestMapping("/company")
@RestController
@AllArgsConstructor
public class CompanyController {
    private final CompanyService companyService;



    // CRUD İŞLEMLERİ YAPTIĞIMIZ CLASS!!

    @Schema(description = "Get Company List")
    @GetMapping("/getCompany")
    public ResponseEntity<List<CompanyDto>> getCompanyList(){
        List<CompanyDto> companyDTOList = this.companyService.getCompanies();
        return  new ResponseEntity<>(companyDTOList, HttpStatus.OK);
    }
    @Schema(description = "Insert Company")
    @PostMapping("/postCompany")
    public ResponseEntity<CompanyDto>insertCompany(@RequestBody CompanyDto companyDto){
        companyDto = this.companyService.insertCompany(companyDto);
        return new ResponseEntity<>(companyDto,HttpStatus.OK);
    }
    @Schema(description = "Delete Company")
    @DeleteMapping("/deleteCompany")
    public void removeCompany(Long id){
        this.companyService.removeCompany(id);
    }

    @Schema(description = "Update Company")
    @PutMapping("/updateCompany")
    public ResponseEntity<CompanyDto>updateCompany(@RequestBody CompanyDto companyDto) {
        companyDto = this.companyService.updateCompany(companyDto);
        return new ResponseEntity<>(companyDto, HttpStatus.OK);

    }


    }
