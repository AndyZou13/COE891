package test;

import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import q1.ArrayMultTest;
import q2.TriangleTest;
import q3.REtest;
import q4.suiteRunner;
import q5.FibonacciTest;
import q6.PrimeTest;
import q7.TheoriesTest;
import q8.q5Theory;
import q8.q6Theory;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ArrayMultTest.class,
	TriangleTest.class,
	REtest.class,
	suiteRunner.class,
	FibonacciTest.class,
	PrimeTest.class,
	TheoriesTest.class,
	q5Theory.class,
	q6Theory.class})

public class testerSuite {

}
