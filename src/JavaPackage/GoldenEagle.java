package JavaPackage;

public class GoldenEagle implements FirstInterface,SecondInterface
// Interfaces can be heridited by "implements" keyword
{

	public static void main(String[] args) 
	{
		GoldenEagle ge = new GoldenEagle(); // object of class stored in class variable
		ge.Figure();
		ge.Sum(45,"vivek");
		
		SecondInterface si = new GoldenEagle(); // object of class stored in Interface variable
		si.Figure(); // only "SecondInterface" methods will be called
		si.Name();
		
		FirstInterface fi = new GoldenEagle(); // object of class stored in Interface variable
		fi.Bank();
		fi.Pulsor();  //// only "FirstInterface" methods will be called
		
	}

	@Override
	public void Name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Figure() {
		System.out.println("this is second figure");
		
	}

	@Override
	public void Sum(int a, String st) {
		System.out.println(+a+","+st);
		
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Bank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pulsor() {
		System.out.println("this is first pulsor");
		
	}
}


