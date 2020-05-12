package JavaPackage;

public interface FirstInterface 
{
	/*An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to 
	  perform all functions of Players .So it specifies a set of methods that the class has to implement. **/
	
	// no method body --> only method declaration
	// can not create object of interface
	// no static methods --> only static variables
	// interface variables are static by default --> values can't be changed later
	void Sum(int a,String st);
	void Display();
	void Bank();
	void Pulsor();
	

}



