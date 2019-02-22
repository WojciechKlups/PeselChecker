package pl.sda;

import java.util.Arrays;
import java.util.Scanner;

public class PeselCheckingThings implements PeselChecker {

    @Override
    public boolean checkPesel(String userPesel) {

        validateLength(userPesel);

        String userPeselStringArray[] = userPesel.split("\\B");
        int userPeselIntArray[] = new int[userPeselStringArray.length];

        for (int i = 0; i < userPeselStringArray.length; i++) {

            userPeselIntArray[i] = Integer.parseInt(userPeselStringArray[i]);
        }

        int algorithmSum = ((9*(userPeselIntArray[0])) + (7*(userPeselIntArray[1])) + (3*(userPeselIntArray[2])) +
                (1*(userPeselIntArray[3])) + (9*(userPeselIntArray[4])) + (7*(userPeselIntArray[5])) + (3*(userPeselIntArray[6])) +
                (1*(userPeselIntArray[7])) + (9*(userPeselIntArray[8])) + (7*(userPeselIntArray[9])));

        int algorithmResult = algorithmSum % 10;

        if (algorithmResult == userPeselIntArray[10]) {
            System.out.println("Your PESEL is correct");
            return true;
        } else {
            System.out.println("Your PESEL is invalid!");
            return false;
        }
    }




    private void validateLength(String userPesel) {
        if (userPesel.length() > 11 || userPesel.length() < 11) {
            throw new TooLongOrTooShortPeselException("Pesel must be 11 numbers long");
        }
    }
}

