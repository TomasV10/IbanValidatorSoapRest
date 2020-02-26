
package com.bit.IbanValidator.generatedSources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validatedIban", propOrder = {
    "iban",
    "isIbanValid"
})
public class ValidatedIban {

    @XmlElement(required = true)
    protected String iban;
    protected boolean isIbanValid;

    public ValidatedIban(String iban, boolean isIbanValid) {
        this.iban = iban;
        this.isIbanValid = isIbanValid;
    }

    public ValidatedIban() {
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public boolean isIbanValid() {
        return isIbanValid;
    }

    public void setIbanValid(boolean ibanValid) {
        isIbanValid = ibanValid;
    }
}
