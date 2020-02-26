package com.bit.IbanValidator;

import com.bit.IbanValidator.validation.Iban;
import com.bit.IbanValidator.validation.IbanValidated;
import com.bit.IbanValidator.validation.IbanValidator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IbanRestServiceTest {

    @Test
    public void getValidatedIbansTest() {
        List<IbanValidated> actualValidatedIbanList = Arrays.asList(new IbanValidated("AA051245445454552117989", false),
                new IbanValidated("LT647044001231465456", true),
                new IbanValidated("LT227044077788877777", false));

        List<Iban> ibans = Arrays.asList(new Iban("AA051245445454552117989"),
                new Iban("LT647044001231465456"),
                new Iban("LT227044077788877777"));

        List<IbanValidated> validatedIbanList = ibans.stream()
                .map(ib -> new IbanValidated(ib.getIban(), IbanValidator.validateIBAN(ib.getIban())))
                .collect(Collectors.toList());

        for (int i = 0; i < actualValidatedIbanList.size(); i++) {
            assertEquals((validatedIbanList.get(i).getIban()), actualValidatedIbanList.get(i).getIban());
            assertEquals((validatedIbanList.get(i).isValidity()), actualValidatedIbanList.get(i).isValidity());
        }
    }
}


