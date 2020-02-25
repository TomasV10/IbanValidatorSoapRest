package com.bit.IbanValidator.validation;

import java.io.IOException;

public class TerminalUtils {
    private IbanReadingTypeSelector ibanReadingTypeSelector = new IbanReadingTypeSelector();

    boolean returnToStartOrQuitApp(String iban) throws IOException {
        if (iban.equals("exit")) {
            return true;
        } else if (iban.equals("back")) {
            ibanReadingTypeSelector.writeIbanOrReadFromFile();
            return true;
        }
        return false;
    }

    public IbanReadingTypeSelector getIbanReadingTypeSelector() {
        return ibanReadingTypeSelector;
    }

    public void setIbanReadingTypeSelector(IbanReadingTypeSelector ibanReadingTypeSelector) {
        this.ibanReadingTypeSelector = ibanReadingTypeSelector;
    }


}
