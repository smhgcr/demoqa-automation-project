import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_LastName_Email extends BaseTest {

    @Test
    public void setName(){
        System.out.println("Test 1");
        practiceFormPage.setName("Semih");
        Assertions.assertEquals("Semih", practiceFormPage.getName(), "Name value is not correct!");
    }

    @Test
    public void setLastName(){
        System.out.println("Test 2");
        practiceFormPage.setLastName("Gecer");
        Assertions.assertEquals("Gecer", practiceFormPage.getLastName(), "Last name value is not correct!");
    }

    @Test
    public void setEmail(){
        System.out.println("Test 3");
        practiceFormPage.setEmail("smh@hotmail.com");
        Assertions.assertEquals("smh@hotmail.com", practiceFormPage.getEmail(), "Email value is not correct!");
    }

}
