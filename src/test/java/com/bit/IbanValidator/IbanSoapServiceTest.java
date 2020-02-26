package com.bit.IbanValidator;

import com.bit.IbanValidator.generatedSources.IbanRequest;
import com.bit.IbanValidator.generatedSources.ValidatedIban;
import com.bit.IbanValidator.validation.IbanValidator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IbanSoapServiceTest {
    @Test
    public void getValidatedIbansTest() {
        List<ValidatedIban> actualValidatedIbanList = Arrays.asList(new ValidatedIban("AA051245445454552117989", false),
                new ValidatedIban("LT647044001231465456", true),
                new ValidatedIban("LT227044077788877777", false));

        IbanRequest request = new IbanRequest();
        request.getIban().add("AA051245445454552117989");
        request.getIban().add("LT647044001231465456");
        request.getIban().add("LT227044077788877777");

        List<ValidatedIban> validatedIbanList = request.getIban().stream()
                .map(ib -> new ValidatedIban(ib, IbanValidator.validateIBAN(ib)))
                .collect(Collectors.toList());

        for (int i = 0; i < actualValidatedIbanList.size(); i++) {
            assertEquals(validatedIbanList.get(i).getIban(), actualValidatedIbanList.get(i).getIban());
            assertEquals(validatedIbanList.get(i).isIbanValid(), actualValidatedIbanList.get(i).isIbanValid());

        }
    }
}
