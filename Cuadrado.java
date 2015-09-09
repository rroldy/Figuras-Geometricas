public class Cuadrado {
	private Integer alto;
	private Integer ancho;
	
	public Cuadrado (Integer alto, Integer ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public boolean esEquilatero() {
		if (this.alto == this.ancho) {
			return true;
		}
		return false;
	}
	
	public boolean esRectangulo() {
		if (this.alto != this.ancho) {
			return true;
		}
		return false;
	}
}