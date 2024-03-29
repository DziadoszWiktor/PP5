package pl.wiktordziadosz.GreeterTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.wiktordziadosz.Greeter.Greeter;

public class GreetingTest {
    @Test
    public void itGreetUser() {
        //Arrange/Given
        String name = "Wiktor";
        Greeter greeter = new Greeter();
        //Act/When
        String greetingText = greeter.hello(name);
        //Assert/Then
        Assertions.assertEquals("Hello Wiktor",greetingText);
    }
}
