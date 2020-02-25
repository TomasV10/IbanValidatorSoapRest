package com.bit.IbanValidator.endpoint;


import com.bit.IbanValidator.services.IbanSoapService;
import com.bit.IbanValidator.generatedSources.IbanRequest;
import com.bit.IbanValidator.generatedSources.IbanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class IbanEndPoint {

    @Autowired
    IbanSoapService ibanSoapService;

    @PayloadRoot(namespace = "http://ibansValidator.com/IbanValidator",
    localPart = "ibanRequest")
    @ResponsePayload
    public IbanResponse IbanValidationRequest(@RequestPayload IbanRequest request){
        return ibanSoapService.validateIbans(request);
    }
}
