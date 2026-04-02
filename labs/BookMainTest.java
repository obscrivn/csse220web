package good;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookMainTest {

	private BookMain app;
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        app = new BookMain();

        originalOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintReportForKidShowsBookName() {
        app.handleNewReading("Moby Dick", "Alice");

        app.handlePrintReportForKid("Alice");
        String output = outContent.toString();

        assertTrue(output.contains("Alice"));
        assertTrue(output.contains("Moby Dick"));
    }

    @Test
    public void testPrintReportForBookShowsKidName() {
        app.handleNewReading("Moby Dick", "Alice");

        app.handlePrintReportForBook("Moby Dick");
        String output = outContent.toString();

        assertTrue(output.contains("Moby Dick"));
        assertTrue(output.contains("Alice"));
    }

    @Test
    public void testMissingKidPrintsMessage() {
        app.handlePrintReportForKid("Charlie");
        String output = outContent.toString();

        assertTrue(output.contains("No such kid: Charlie"));
    }

    @Test
    public void testMissingBookPrintsMessage() {
        app.handlePrintReportForBook("Hatchet");
        String output = outContent.toString();

        assertTrue(output.contains("No such book: Hatchet"));
    }

    @Test
    public void testMultipleReadingsAppearInKidReport() {
        app.handleNewReading("Moby Dick", "Alice");
        app.handleNewReading("1984", "Alice");

        app.handlePrintReportForKid("Alice");
        String output = outContent.toString();

        assertTrue(output.contains("Alice"));
        assertTrue(output.contains("Moby Dick"));
        assertTrue(output.contains("1984"));
    }

    @Test
    public void testMultipleKidsAppearInBookReport() {
        app.handleNewReading("Moby Dick", "Alice");
        app.handleNewReading("Moby Dick", "Bob");

        app.handlePrintReportForBook("Moby Dick");
        String output = outContent.toString();

        assertTrue(output.contains("Moby Dick"));
        assertTrue(output.contains("Alice"));
        assertTrue(output.contains("Bob"));
    }
    
    @Test
    public void testDuplicateReadingNotPrintedTwiceForKid() {
        app.handleNewReading("Moby Dick", "Alice");
        app.handleNewReading("Moby Dick", "Alice");

        app.handlePrintReportForKid("Alice");
        String output = outContent.toString();

        int first = output.indexOf("Moby Dick");
        int last = output.lastIndexOf("Moby Dick");

        assertTrue(first != -1);
        assertTrue(first == last);
    }
}