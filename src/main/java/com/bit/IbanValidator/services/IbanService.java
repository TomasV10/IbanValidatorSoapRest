package com.bit.IbanValidator.services;
import com.bit.IbanValidator.validation.IbanValidator;
import com.ibansvalidator.ibanvalidator.ValidatedIban;
import com.ibansvalidator.ibanvalidator.IbanRequest;
import com.ibansvalidator.ibanvalidator.IbanResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class IbanService {

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
