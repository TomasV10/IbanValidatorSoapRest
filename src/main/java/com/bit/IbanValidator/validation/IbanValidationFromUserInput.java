package com.bit.IbanValidator.validation;

import java.io.IOException;

class IbanValidationFromUserInput {
    private TerminalUtils utils = new TerminalUtils();

    void readingIbanWrittenByHand() throws IOException {
        while (true) {
            System.out.println("For IBAN validation please write IBAN and press enter. Write 'exit' to quit application or 'back' - return to start");
            String iban = utils.getIbanReadingTypeSelector().getScanner().nextLine();
            if (utils.returnToStartOrQuitApp(iban)) break;
            System.out.println(iban + " " + IbanValidator.validateIBAN(iban));
        }
    }
}
