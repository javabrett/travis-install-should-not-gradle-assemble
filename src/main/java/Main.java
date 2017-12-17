import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		final Main main = new Main();
		System.out.println(main.toString());
	}

	private final Properties props = new Properties();

	public Main() throws Exception {
		props.load(getClass().getClassLoader().getResource("main.properties").openStream());
	}

	public String getEnv() {
		return props.getProperty("env");
	}

	@Override
	public String toString() {
		return getEnv();
	}
}
