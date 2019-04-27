package tea_party;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TeaPartyTest {
    /**
     * Jane Austen is a woman, so say “Hello Ms. Austen”. 
     * George Orwell is a man, so say “Hello Mr. Orwell”. 
     * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
     **/

    @Test
    public void test() {
            Tea_Party teaParty = new Tea_Party();
            String greeting = teaParty.welcome(null, false, false);
            assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
            assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
            assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
    }
}
