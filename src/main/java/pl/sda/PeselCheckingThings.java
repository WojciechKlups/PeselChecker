package pl.sda;

import java.util.Arrays;
import java.util.Scanner;

public class PeselCheckingThings implements PeselChecker {

    @Override
    public boolean checkPesel(String userPesel) {

        validateInput(userPesel);
        validateLength(userPesel);

        String userPeselStringArray[] = userPesel.split("\\B");
        int userPeselIntArray[] = new int[userPeselStringArray.length];

        for (int i = 0; i < userPeselStringArray.length; i++) {

            userPeselIntArray[i] = Integer.parseInt(userPeselStringArray[i]);
        }
        int algorithmSum = 0;

        int[] algorithmMultiplicators = new int[]{9, 7, 3, 1, 9, 7, 3, 1, 9, 7};

        for (int i = 0; i < userPeselStringArray.length - 1 ; i++) {

            algorithmSum = algorithmSum + userPeselIntArray[i] * algorithmMultiplicators[i];
            
        }

        int algorithmResult = algorithmSum % 10;

        if (algorithmResult == userPeselIntArray[10]) {
            System.out.println("Your PESEL is correct");
            return true;
        } else {
            System.out.println("Your PESEL is invalid!");
            return false;
        }
    }

    private void validateInput(String userPesel) {
        if (!userPesel.matches("\\d+")) {
            throw new TextInputAsPeselException("Pesel has only digits");
        }
    }


    private void validateLength(String userPesel) {
        if (userPesel.length() > 11 || userPesel.length() < 11) {
            throw new TooLongOrTooShortPeselException("Pesel must be 11 numbers long");
        }
    }
}

