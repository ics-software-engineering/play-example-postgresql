import org.junit.*;
import controllers.Application;
import play.test.*;
import play.libs.F.*;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

/**
 * Do integration testing. This means do tests with complete running application.
 * @author Philip Johnson
 */
public class IntegrationTest {

  /**
    * add your integration test here
    * in this example we just check if the welcome page is being shown
   */   
    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertThat(browser.pageSource()).contains(Application.homePageString);
            }
        });
    }
  
}
