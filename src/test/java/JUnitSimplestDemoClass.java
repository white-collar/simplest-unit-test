import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitSimplestDemoClass {

    @Test
    void simplestTest() {
        assertEquals(2, 1+1, " Expression 1+1 should be equals 2");
    }

}
