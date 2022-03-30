import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_LastName_Email extends BaseTest {

    @Test
    public void setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Semih");
        Assertions.assertEquals("Semih", practiceFormPage.getName(), "Name value is not correct!");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Gecer");
        Assertions.assertEquals("Gecer", practiceFormPage.getLastName(), "Last name value is not correct!");
    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("smh@hotmail.com");
        Assertions.assertEquals("smh@hotmail.com", practiceFormPage.getEmail(), "Email value is not correct!");
    }

}
