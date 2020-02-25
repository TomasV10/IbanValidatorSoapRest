
package com.bit.IbanValidator.generatedSources;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public IbanRequest createIbanRequest() {
        return new IbanRequest();
    }

    public IbanResponse createIbanResponse() {
        return new IbanResponse();
    }

    public ValidatedIban createValidatedIban() {
        return new ValidatedIban();
    }

}
