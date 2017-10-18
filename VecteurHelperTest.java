import static org.junit.Assert.*;

import org.junit.Test;

public class VecteurHelperTest {

	@Test
	public void testVecteurHelper() 
	{
		VecteurHelper V = new VecteurHelper();
		int [] t = {0,0,0,0,0};
		assertArrayEquals(V.tab, t);;
	}

	@Test
	public void testTrier() 
	{
		VecteurHelper V = new VecteurHelper();
		int tab[] = {2,5,3,4,1};
		V.tab = tab;
		V.Trier();
		for(int i=0; i<3; i++)assertTrue(V.tab[i]<=V.tab[i+1]);
	}

	@Test
	public void testSommer() 
	{
		VecteurHelper V = new VecteurHelper();
		int []tab1 = {1,8,5,6,3};
		int []tab2 = {7,5,6,2,1};
		V.Sommer(tab1, tab2);
		for(int i=0; i<5; i++) assertTrue(tab1.length==V.tab.length & tab2.length==V.tab.length & V.tab[i] == tab1[i]+tab2[i]);
	}

	@Test
	public void testInverser() 
	{
		VecteurHelper V = new VecteurHelper();
		int tab[] = {2,5,3,4,1};
		V.tab = tab;
		V.Inverser();
		
	}

	@Test
	public void testExtrimum() {
		fail("Not yet implemented");
	}

	@Test
	public void testFormule() {
		fail("Not yet implemented");
	}

}
