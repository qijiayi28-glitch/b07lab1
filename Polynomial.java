public class Polynomial{
	private double[] coefs;
	
	public Polynomial(){
		coefs = new double[1];
	}

	public Polynomial(double [] new_coefs){
		coefs= new double[new_coefs.length];
		for(int i=0; i<new_coefs.length;i++){
			coefs[i]= new_coefs[i];
		}
	}

	public Polynomial add(Polynomial other){
		double[] result; 
		int i;
		if(other.coefs.length > coefs.length){
			result=new double[other.coefs.length];
			for( i=0; i< coefs.length;i++){
				result[i]=coefs[i]+other.coefs[i];
			}
			while(i<other.coefs.length){
				result[i]=other.coefs[i];
				i++;
			}
		} else{
			result=new double[coefs.length];
			for( i=0; i< other.coefs.length;i++){
				result[i]=coefs[i]+other.coefs[i];
			}
			while(i<coefs.length){
				result[i]=coefs[i];
				i++;
			}
		}
		return new Polynomial(result);
	}
	
	public double evaluate(double x){
		int len=coefs.length;
		double result=0;
		for(int i=0; i<len;i++){
			result+=coefs[i]*Math.pow(x, i);
		}
		return result;
	}

	public boolean hasRoot(double num){
		double result=evaluate(num);
		return result == 0;
	}
}
		

		

			

	