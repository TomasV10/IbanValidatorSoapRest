package com.bit.IbanValidator.endpoint;


import com.bit.IbanValidator.services.IbanService;
import com.ibansvalidator.ibanvalidator.IbanRequest;
import com.ibansvalidator.ibanvalidator.IbanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class IbanEndPoint {

    @Autowired
     IbanService ibanService = new IbanService();

    @PayloadRoot(namespace = "http://ibansValidator.com/IbanValidator",
    localPart = "ibanRequest")
    @ResponsePayload
    public IbanResponse IbanValidationRequest(@RequestPayload IbanRequest request){
        return ibanService.validateIbans(request);
    }
}
