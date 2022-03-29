import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest {

    @Test
    public void check_male_radio_button() {
        practiceFormPage.getGenderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.getGenderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                "Male radio button is not check");
    }

    @Test
    public void check_female_radio_button() {
        practiceFormPage.getGenderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.getGenderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "Female radio button is not check");
    }

    @Test
    public void check_other_radio_button() {
        practiceFormPage.getGenderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFormPage.getGenderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "Other radio button is not check");
    }

}
