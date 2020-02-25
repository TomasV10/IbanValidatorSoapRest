
package com.bit.IbanValidator.generatedSources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iban"
})
@XmlRootElement(name = "ibanRequest")
public class IbanRequest {

    @XmlElement(required = true)
    protected List<String> iban;

    public List<String> getIban() {
        if (iban == null) {
            iban = new ArrayList<String>();
        }
        return this.iban;
    }

}
