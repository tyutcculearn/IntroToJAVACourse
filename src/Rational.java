
public class Rational {

	private int nomerator, denominator;
	
	public Rational(){
		this.nomerator = 0;
		this.denominator = 0;
	}
	public Rational(int nomerator, int denominator){
		
		
		int commonDivisor = gcd(nomerator, denominator);
		this.nomerator = nomerator / commonDivisor;
		this.denominator = denominator / commonDivisor;
		
	}// End of constructor
	
	private int gcd(int a, int b){
		
		if(a == 0 || b == 0){
			return a+b;
		}
		return gcd(b,a%b);
	}
	
	public static Rational addition(Rational a, Rational b){
		Rational result ;//
		if(a.denominator == b.denominator){
			result = new Rational((a.nomerator+b.nomerator), (a.denominator));
		}else{
			result = new Rational(((a.nomerator*b.denominator)+(b.nomerator*a.denominator)), (a.denominator*b.denominator));
		}
		return result;
	}
	
	public String toString(){
		return String.format("%d/%d",this.nomerator,this.denominator);
	}
	
}// End of Rational Class
