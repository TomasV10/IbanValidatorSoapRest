package com.bit.IbanValidator.validation;

import java.io.IOException;
import java.util.Scanner;

public class IbanReadingTypeSelector {
    private Scanner scanner;

    public IbanReadingTypeSelector() {
        this.scanner = new Scanner(System.in);
    }

    public void writeIbanOrReadFromFile() throws IOException {
        System.out.println("Choose IBAN reading type: write '1' - write down IBAN by yourself; '2' - reading IBANS from file");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                IbanValidationFromUserInput ibanValidationFromUserInput = new IbanValidationFromUserInput();
                ibanValidationFromUserInput.readingIbanWrittenByHand();
                break;
            case 2:
                IbanValidationFromFile ibanValidationFromFile = new IbanValidationFromFile();
                ibanValidationFromFile.readingFromFile();
                break;
            default:
                System.out.println("Command is not recognized, try again");
                writeIbanOrReadFromFile();
        }
    }
    public Scanner getScanner() {
        return scanner;
    }
}

