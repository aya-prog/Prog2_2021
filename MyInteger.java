package aufgabe2;

public class MyInteger {

	// Statische Konstanten
	
	public final static int  MAX_VALUE = 2147483647;
	public final static int  MIN_VALUE = -2147483647;
	
	
	private int value;
	
	
	//Konstruktoren
	//init objektvariable aus variable
	
	public MyInteger (int value) {
		
		this.value =value;
	}
		

	 public MyInteger(String s) throws IllegalArgumentException{
			
		  this.value = parseInt(s);
	}
	
	//Objektmethoden
	 
	
	public int intValue()
	 {
		 return this.value;
	 }
	
	public double doubleValue()
	{
		return this.value;
	}
		
			// Konstruktor Methode rückgabe objekt
			
	public static MyInteger valueOf(String s) throws IllegalArgumentException{
		
		return new MyInteger(s);
	}
	 
	public static MyInteger valueOf(int value) 
	{
		return new MyInteger(value);	
	}
	
	
	 //hier werden die nullen übersprungen und in s erneut gespeichert
	
	static String nullPruefung(String s) {

		  while (s.charAt(0) =='0')
			{
				s = s.substring(1);
			}
		  return s;
	}

	
	

			// Diese noch alle ändern vvvvvvvvvvvvv

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public String toString() {
		return super.toString();
	}

	

	public static int parseInt (String s) {
		
		// a) s kann mit + oder - beginnen
		// b) s kann führende Nullen aufweisen
		// c) s kann mit length laenge bestimmen und alle einzeln mit chatAt(index) betrachtet werden
		// d) s wenn leer ist, IllegalArgumentException <<< equals? oder array speichern und null prüfung und wenn keine zahl ist!
		// e)   Exceptions werden nur weitergereicht nicht gelöst
		
		if(s.length()== 0) throw new IllegalArgumentException("Eingabe leer");
		
		boolean negativ = false;
		
		if(s.charAt(0)=='+')
		{
			s = s.substring(1);
		}
		else if(s.charAt(0)=='-')
		{
			s = s.substring(1);
			negativ = true;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		return 0;
	}
	
	
	
	
	
	
}
