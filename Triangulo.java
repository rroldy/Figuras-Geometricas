public class Triangulo {
	private Integer lado;
	private Integer lado1;
	private Integer lado2;
	
	public Triangulo(Integer lado, Integer lado1, Integer lado2) {
		this.lado = lado;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public boolean esEquilatero() {
		if ((this.lado == this.lado1) && ( this.lado == this.lado2)){
			return true;
		}
		else
			return false;
	}
	
	public boolean esIsoceles() {
		if ( ((this.lado == this.lado1) && ( this.lado != this.lado2)) || ((this.lado1 == this.lado2) && (this.lado1 != this.lado)) ){
			return true;
		}
		else
			return false;
	}
	
	public boolean esEscaleno() {
		if ( (this.lado != this.lado1) && (this.lado != this.lado2)) {
			return true;
		}
		else
			return false;
	}
}