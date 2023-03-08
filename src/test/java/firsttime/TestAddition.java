package firsttime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddition {
	
    @Test
    public void testNameMkyong() {

        Addition obj = new Addition();
        assertEquals("Hello mkyong", obj.getMessage("mkyong"));

    }
    @Test
    public void testNameEmpty() {

        Addition obj = new Addition();
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }

    @Test
    public void testNameNull() {

        Addition obj = new Addition();
        assertEquals("Please provide a name!", obj.getMessage(null));

    }

}
