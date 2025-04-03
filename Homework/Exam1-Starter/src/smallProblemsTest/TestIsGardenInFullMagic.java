package smallProblemsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import smallProblems.SmallProblems;

public class TestIsGardenInFullMagic {

	@Test
    public void testGardenInFullMagic() {
        String[] gardenState = {"Rose", "Magic Flower", "Lily", "Tulip","Rose"};
        assertTrue(SmallProblems.isGardenInFullMagic(gardenState));
    }
    
    @Test
    public void testGardenNotInFullMagicDueToWeeds() {
        String[] gardenState = {"Weeds", "Magic Flower", "Lily", "Rose", "Tulip"};
        assertFalse(SmallProblems.isGardenInFullMagic(gardenState));
    }
    
    @Test
    public void testGardenNotInFullMagicDueToEvenNumber() {
        String[] gardenState = {"Rose", "Magic Flower", "Lily", "Tulip"};
        assertFalse(SmallProblems.isGardenInFullMagic(gardenState));
    }

    @Test
    public void testGardenNotInFullMagicDueToLackOfMagicFlower() {
        String[] gardenState = {"Rose", "Lily", "Tulip"};
        assertFalse(SmallProblems.isGardenInFullMagic(gardenState));
    }
    
    @Test
    public void testGardenNotInFullMagicDueToLength() {
        String[] gardenState = {"Magic Flower"};
        assertFalse(SmallProblems.isGardenInFullMagic(gardenState));
    }

}

