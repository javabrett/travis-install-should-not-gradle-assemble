import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MainTest {

	@Test
	public void testGetEnv() throws Exception {
		final Main main = new Main();

		String env = System.getenv("ENV");
		env = env == null ? "" : env;
		assertEquals(main.getEnv(), env, "unexpected ENV");
	}
}
