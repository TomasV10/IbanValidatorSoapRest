package com.bit.IbanValidator;

import com.bit.IbanValidator.services.IbanRestService;
import static org.junit.jupiter.api.Assertions.*;
import com.bit.IbanValidator.validation.IbanValidator;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IbanValidatorTest {

	@Test
	void validateIbanCorrect(){
		boolean ibanValid = IbanValidator.validateIBAN("LT647044001231465456");
		assertTrue(ibanValid);
	}
	@Test
	void validateIbanIncorrect(){
		boolean ibanValid = IbanValidator.validateIBAN("CC051245445454552117989");
		assertFalse(ibanValid);
	}
	@Test
	void shouldValidateIbansWithSpecialSymbols(){
		boolean ibanValid = IbanValidator.validateIBAN("CC.0512@454?454@5455!2117989!");
		assertFalse(ibanValid);
	}

}
