package mapsAndArrays2D;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import mapsAndArrays2DTest.TestFindTreasure;
import mapsAndArrays2DTest.TestGetBooksByGenre;
import mapsAndArrays2DTest.TestSumBorderElements;

@RunWith(Suite.class)
@SuiteClasses({TestFindTreasure.class, TestSumBorderElements.class, TestGetBooksByGenre.class})
public class RunAllTests { }
