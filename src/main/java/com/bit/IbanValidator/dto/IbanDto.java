package com.bit.IbanValidator.dto;

import com.bit.IbanValidator.validation.IbanValidated;
import java.util.List;

public class IbanDto {
    private List<IbanValidated> validatedIbans;

    public List<IbanValidated> getValidatedIbans() {
        return validatedIbans;
    }

    public void setValidatedIbans(List<IbanValidated> validatedIbans) {
        this.validatedIbans = validatedIbans;
    }

}
