import org.junit.Assert;
import org.junit.Test;

public class TestCuadrado {
	@Test
	public void verificarEsEquilatero(){
		Cuadrado cuadrado = new Cuadrado(4,4);
		Assert.assertTrue(cuadrado.esEquilatero());
	}
	
	@Test
	public void verificarNoEsEquilatero(){
		Cuadrado cuadrado = new Cuadrado(4,6);
		Assert.assertTrue(cuadrado.esEquilatero());
	}
	
	@Test
	public void verificarEsRectangulo(){
		Cuadrado cuadrado = new Cuadrado(4,1);
		Assert.assertTrue(cuadrado.esRectangulo());
	}
	
	@Test
	public void verificarNoEsRectangulo(){
		Cuadrado cuadrado = new Cuadrado(4,4);
		Assert.assertFalse(cuadrado.esRectangulo());
	}
}
