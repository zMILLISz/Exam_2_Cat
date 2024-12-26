import org.example.Cat;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testStatus() {
        Cat cat = new Cat();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        for (int i = 0; i < 10; i++) {
            cat.status();
        }

        String output = outContent.toString();
        assertTrue(output.contains("Sleep") || output.contains("Meow") || output.contains("Eat"));
    }
}

