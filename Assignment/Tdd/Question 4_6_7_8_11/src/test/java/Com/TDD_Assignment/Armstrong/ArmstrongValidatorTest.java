package Com.TDD_Assignment.Armstrong;

import static org.junit.Assert.*;
import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

public class ArmstrongValidatorTest {
	@Test
    public void _153IsValidThreeDigitArmstrongNumber() {
        boolean valid = new ArmstrongValidator().isValid(153);

        assertThat(valid).isTrue();
    }

    @Test
    public void _1634IsValidFourDigitArmstrongNumber() {
        boolean valid = new ArmstrongValidator().isValid(1634);

        assertThat(valid).isTrue();
    }

    @Test
    public void _370IsValidThreeDigitArmstrongNumber() {
        boolean valid = new ArmstrongValidator().isValid(370);

        assertThat(valid).isTrue();
    }

    @Test
    public void _371IsValidThreeDigitArmstrongNumber() {
        boolean valid = new ArmstrongValidator().isValid(371);

        assertThat(valid).isTrue();
    }

    @Test
    public void _407IsValidThreeDigitArmstrongNumber() {
        boolean valid = new ArmstrongValidator().isValid(407);

        assertThat(valid).isTrue();
    }

    @Test
    public void _8208IsValidFourDigitArmstrongNumber() {
        boolean valid = new ArmstrongValidator().isValid(8208);

        assertThat(valid).isTrue();
    }
}
