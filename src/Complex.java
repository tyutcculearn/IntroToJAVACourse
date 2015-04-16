import java.lang.Math;

public class Complex {

	private double imaginary,real;
	private final double i = Math.sqrt(-1);
	
	public Complex (double imaginary, double real){
		this.imaginary = imaginary;
		this.real = real;
	}
	public Complex(){
		this.imaginary = 1.0f;
		this.real = 1.0f;
	}
	
	public Complex add(Complex a){
		return new Complex(imaginary+a.imaginary, real+a.real);
	}
	public Complex sub(Complex b){
		return new Complex(imaginary-b.imaginary, real-b.real);
	}
	public String toString(){
		String x = String.format("(%.2f+%.2f)\n", getIma(),getReal()); 
		return x;
	}
	public double getIma(){
		return imaginary;
	}
	public double getReal(){
		return real;
	}
	
}
