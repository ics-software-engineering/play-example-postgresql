import models.PageRetrieval;
import org.junit.Test;
import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;

/**
 * Check the model implementation.
 * @author Philip Johnson
 */
public class ModelTest {

  /**
   * Create and save an instance and see if it can be retrieved.
   * NOTE: currently fails when run in IntelliJ with a PersistenceException. Runs fine with 'activator test'.
   */   
    @Test
    public void test() {
      running(fakeApplication(inMemoryDatabase()), new Runnable() {
            public void run() {
              PageRetrieval newStamp = new PageRetrieval();
              newStamp.save();
              assertThat(PageRetrieval.find().all().size()).isEqualTo(1);
            }
        });
    }
  
}
