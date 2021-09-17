package Main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSearchMainMethod() {

        String expected = Main.search("aadsjkfh3ioew");
        String actual = "yes";
        Assert.assertEquals(expected, actual);

        expected = Main.search("aaadsjkfh3ioew");
        actual = "no";
        Assert.assertEquals(expected, actual);

        expected = Main.search("00");
        actual = "yes";
        Assert.assertEquals(expected, actual);

        expected = Main.search("000");
        actual = "no";
        Assert.assertEquals(expected, actual);

        expected = Main.search("aaadsjkfh003ioew");
        actual = "yes";
        Assert.assertEquals(expected, actual);


    }
}