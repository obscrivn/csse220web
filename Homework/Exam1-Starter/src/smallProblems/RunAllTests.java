package smallProblems;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import smallProblemsTest.TestGenerateSnakeCase;
import smallProblemsTest.TestGenerateUsernames;
import smallProblemsTest.TestIsGardenInFullMagic;



@RunWith(Suite.class)
@SuiteClasses({TestIsGardenInFullMagic.class, TestGenerateUsernames.class, TestGenerateSnakeCase.class})
public class RunAllTests { }
