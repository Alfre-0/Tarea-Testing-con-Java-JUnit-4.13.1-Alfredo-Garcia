package mockitoEjercicio.AlfredoGarcia;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ 3490-24-13232
// SE AGREGO ESTA CLASE YA QUE ESTOY TRABAJANDO CON ECLIPLE Y PODER EJECUTAR CUCUMBER


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/mockitoEjercicio/AlfredoGarcia", // Ruta archivo .feature
    glue = "mockitoEjercicio.AlfredoGarcia",                        // Paquete GameSteps
    plugin = {"pretty", "summary"}
)
public class GameFeatureTest {
}
