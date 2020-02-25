package com.bit.IbanValidator.services;

import com.bit.IbanValidator.dto.IbanDto;
import com.bit.IbanValidator.validation.IbanValidated;
import com.bit.IbanValidator.validation.Iban;
import com.bit.IbanValidator.validation.IbanValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IbanRestService  {

    public IbanDto validateIbans(List<Iban> ibans){
        IbanDto dto = new IbanDto();
        dto.setIbanValidateds(getValidatedIbans(ibans));
        return dto;
    }

    public List<IbanValidated>getValidatedIbans(List<Iban> ibans){
        return ibans.stream()
                .map(ib -> new IbanValidated(ib.getIban(), IbanValidator.validateIBAN(ib.getIban())))
                .collect(Collectors.toList());
    }
}
