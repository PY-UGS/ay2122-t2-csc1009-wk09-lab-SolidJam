import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.*;

public class unitTestingCase {
    RandomCharacter rand;
    String randChar;

    @Before
    //Initialize the setup of the TestingCase
    public void setup() {
        System.out.println("Initializing...");
        rand = new RandomCharacter(15);
    }

    @Test
    //Checks if the number is UpperCase
    public void testUpperCase() {
        randChar = rand.getRandUpperCaseLetter();
        assertSame(randChar, randChar.toUpperCase());
    }

    @Test
    //Checks if the number is LowerCase
    public void testLowerCase() {
        randChar = rand.getRandLowerCaseLetter();
        assertSame(randChar, randChar.toLowerCase());
    }

    @Test
    //Checks if the number is within range
    public void testDigitCharacter() {
        randChar = rand.getRandDigitCharacter();
        assertTrue(0 <= Integer.parseInt(randChar) && Integer.parseInt(randChar) <= 10);
    }

    @Test
    //Checks if the number is Prime
    public void checkPrime() {
        randChar = rand.getRandDigitCharacter();
        boolean RedFlag = false;
        int num = Integer.parseInt(randChar);

        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                RedFlag = true;
                break;
            }
        }
        assertTrue(!RedFlag);
    }

    /*@After
    public void TearDownCase() throws Exception {
        System.out.println("Closed...");
    }
     */

}