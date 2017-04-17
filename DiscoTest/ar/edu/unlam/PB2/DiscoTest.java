package ar.edu.unlam.PB2;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {
	@Test
	public void testCalcularElArea(){
		Disco disco1 = new Disco (1.00,4.00);
		Double areaObtenida = disco1.getArea();
		Double areaEsperada = 47.12388980384689;
		System.out.println(disco1.getArea());
		Assert.assertEquals(areaEsperada, areaObtenida);					
	}
	@Test
	public void testCalcularPerimetroInterior(){
		Disco disco2 = new Disco(2.00,8.00);
		Double perimetroInteriorObtenido=disco2.getPerimetroInterior();
		Double perimetroInteriorEsperado=12.566370614359172;
		System.out.println(disco2.getPerimetroInterior());
		Assert.assertEquals(perimetroInteriorEsperado, perimetroInteriorObtenido);
	}
	@Test
	public void testCalcularPerimetroExterior(){
		Disco disco3 = new Disco(2.00,8.00);
		Double perimetroExteriorObtenido=disco3.getPerimetroExterior();
		Double perimetroExteriorEsperado=50.26548245743669;
		System.out.println(disco3.getPerimetroExterior());
		Assert.assertEquals(perimetroExteriorEsperado, perimetroExteriorObtenido);
		
	}
}
