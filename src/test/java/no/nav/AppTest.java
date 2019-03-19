package no.nav;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Human-readable test name")
    @Description("Some detailed test description")
    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("FP-1104")
    public void shouldAnswerWithTrue()
    {
        loginWith();
        doProcess();
        assertTrue( true );
    }


    @Step("Logging in with the user")
    @Description("This step logs in the user")
    public void loginWith() {
    }

    @Step("User Performing the process")
    public void doProcess() {
    }
}
