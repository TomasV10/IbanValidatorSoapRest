
package com.bit.IbanValidator.generatedSources;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iban",
    "validatedIban"
})
@XmlRootElement(name = "ibanResponse")
public class IbanResponse {

    @XmlElement(required = true)
    protected String iban;
    @XmlElement(required = true)
    protected List<ValidatedIban> validatedIban;


    public void setValidatedIban(List<ValidatedIban> validatedIban) {
        this.validatedIban = validatedIban;
    }
}
