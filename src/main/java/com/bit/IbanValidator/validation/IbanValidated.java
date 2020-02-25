package com.bit.IbanValidator.validation;

public class IbanValidated {
    private String iban;
    private boolean validity;


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    public IbanValidated(String iban, boolean validity) {
        this.iban = iban;
        this.validity = validity;
    }

    public IbanValidated() {
    }
}

