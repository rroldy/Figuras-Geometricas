import org.junit.Assert;
import org.junit.Test;

public class TestTriangulo {
	@Test
	public void verificarEsEquilatero(){
		Triangulo triangulo = new Triangulo(4,4,4);
		Assert.assertTrue(triangulo.esEquilatero());
	}
	
	@Test
	public void verificarNoEsEquilatero(){
		Triangulo triangulo = new Triangulo(4,3,4);
		Assert.assertFalse(triangulo.esEquilatero());
	}
	
	@Test
	public void verificarEsIsoceles(){
		Triangulo triangulo = new Triangulo(4,4,1);
		Assert.assertTrue(triangulo.esIsoceles());
	}
	
	@Test
	public void verificarNoEsIsoceles(){
		Triangulo triangulo = new Triangulo(4,4,4);
		Assert.assertFalse(triangulo.esIsoceles());
	}
	
	@Test
	public void verificarEsEscaleno(){
		Triangulo triangulo = new Triangulo(1,2,3);
		Assert.assertTrue(triangulo.esEscaleno());
	}
	
	@Test
	public void verificarNoEsEscaleno(){
		Triangulo triangulo = new Triangulo(4,4,4);
		Assert.assertFalse(triangulo.esEscaleno());
	}
}
