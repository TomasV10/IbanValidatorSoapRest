package com.bit.IbanValidator.services;
import com.bit.IbanValidator.validation.IbanValidator;
import com.bit.IbanValidator.generatedSources.ValidatedIban;
import com.bit.IbanValidator.generatedSources.IbanRequest;
import com.bit.IbanValidator.generatedSources.IbanResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class IbanSoapService {

    public IbanResponse validateIbans(IbanRequest request){
        IbanResponse response = new IbanResponse();
        response.setValidatedIban(getValidatedIbans(request));
        return response;
    }

    public List<ValidatedIban> getValidatedIbans(IbanRequest request){
        return request.getIban().stream()
                .map(ib -> new ValidatedIban(ib, IbanValidator.validateIBAN(ib)))
                .collect(Collectors.toList());
    }
}
