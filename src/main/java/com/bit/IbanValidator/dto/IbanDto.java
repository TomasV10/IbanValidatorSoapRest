package com.bit.IbanValidator.dto;

import com.bit.IbanValidator.validation.IbanValidated;

import java.util.List;

public class IbanDto {
    private String iban;
    private List<IbanValidated> ibanValidateds;


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public List<IbanValidated> getIbanValidateds() {
        return ibanValidateds;
    }

    public void setIbanValidateds(List<IbanValidated> ibanValidateds) {
        this.ibanValidateds = ibanValidateds;
    }
}
