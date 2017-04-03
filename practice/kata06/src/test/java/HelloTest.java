import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
 
public class HelloTest {

	@Test
	public void HelloTest() {
		System.out.println("######### Running test ... ");
		HelloWorld h = new HelloWorld();
		String str = "Hi";
		assertEquals(str, h.getHello());
	}

	@Before
	public void setUpBefore() {
		System.out.println("######### Running before ... ");
	}

	@After
	public void cleanUpAfter() {
		System.out.println("######### Running after ... ");
	}
}