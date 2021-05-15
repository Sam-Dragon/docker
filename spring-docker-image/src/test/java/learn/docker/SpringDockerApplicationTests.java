package learn.docker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDockerApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(SpringDockerApplicationTests.class);

	@Test
	void contextLoads() {
		assertEquals(true, true);

		logger.info(() -> "Test Case Executing");
	}

}
