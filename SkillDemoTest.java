import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test

    public void multiply() {
        assertEquals(5, SkillDemo.multiply(3, 2)); // test that fails
    }
}
