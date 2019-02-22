package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class PeselCheckingThingsTest {

    @Test
    public void shouldThrowExceptionWhenPeselIsLessThan11OrMoreThan11() {
        //Given
            PeselCheckingThings peselCheckingThings = new PeselCheckingThings();
        //When
        try {
            peselCheckingThings.checkPesel("27365");
            Assert.fail("Exception was not thrown");
        } catch (TooLongOrTooShortPeselException e){
            e.printStackTrace();
        }
        //Then

    }

    @Test
    public void shouldThrowExceptionWhenUserInputsText() {
        //Given
        PeselCheckingThings peselCheckingThings = new PeselCheckingThings();
        //When
        try {
            peselCheckingThings.checkPesel("pokpofs");
            Assert.fail("Exception was not thrown");
        } catch (TextInputAsPeselException e) {
            e.printStackTrace();
        }
        //Then
    }

}