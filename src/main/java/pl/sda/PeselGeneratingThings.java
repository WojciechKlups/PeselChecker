package pl.sda;

public class PeselGeneratingThings implements PeselGenerator {
    @Override
    public String generatePesel(String birthDate, Gender gender) {



        return null;
    }

    private void validateDate(String birthDate) {
        if (!birthDate.matches("\\d+")) {
            throw new TextInputAsBirthDateException("Please enter date in format: dd//mm//yyyy");
        }
    }
}
