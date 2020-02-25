package com.bit.IbanValidator;

import com.bit.IbanValidator.validation.IbanReadingTypeSelector;

import java.io.IOException;

public class IbanValidationTerminalApplication {
    public static void main(String[] args) throws IOException {
        IbanReadingTypeSelector ibanReadingTypeSelector = new IbanReadingTypeSelector();
        ibanReadingTypeSelector.writeIbanOrReadFromFile();
    }
}
