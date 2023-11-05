package testPackage;


import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups =  {"smoke"})
	public void test1() {
		System.out.println("Running test 1");
	}
	
	@Test(groups = {"smoke"}, retryAnalyzer = TestNGRetryFailed.class)
	public void test2() {
		System.out.println("Running test 2");
		int i=1/0;
	}
	
	@Test
	public void test3() {
		System.out.println("Running test 3");
	}
	
	
}
