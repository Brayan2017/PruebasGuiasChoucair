package proyectobase2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_CC =Target.the("Select Cursos y Certificaciones")
            .located(By.cssSelector("#certificaciones"));

    public static final Target INPUT_COURSE =Target.the("Search the Course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO =Target.the("Go to the Course")
            .located(By.xpath("//button[contains(text(),'Ir')]"));

    public static final Target SELLECT_COURSE =Target.the("Click on the course")
            .located(By.xpath("//h4/a[contains(text(), 'Workshop de Automatizaci')]"));

    public static final Target NAME_COURSE =Target.the("Compare the name of the course")
            .located(By.xpath("//h1[contains(text(),'Workshop de Automatizaci')]"));



}
