package com.bit.IbanValidator.controllers;

import com.bit.IbanValidator.dto.IbanDto;
import com.bit.IbanValidator.services.IbanRestService;
import com.bit.IbanValidator.validation.Iban;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IbanController {

    @Autowired
    IbanRestService ibanRestService;

    @PostMapping("/ibans")
    public IbanDto getAllIbans(@RequestBody List<Iban>ibans){
        return ibanRestService.validateIbans(ibans);

    }
}
