package com.bit.IbanValidator.dto;

import com.bit.IbanValidator.validation.IbanValidated;
import java.util.List;

public class IbanDto {
    private String iban;
    private List<IbanValidated> validatedIbans;


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public List<IbanValidated> getValidatedIbans() {
        return validatedIbans;
    }

    public void setValidatedIbans(List<IbanValidated> validatedIbans) {
        this.validatedIbans = validatedIbans;
    }

}
