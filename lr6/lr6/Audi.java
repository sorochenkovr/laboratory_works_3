package lr6;
import lr6.audi_enum;

public class Audi  implements IDraw {
		
	audi_enum aud;
		
		public Audi() {}
		public Audi(audi_enum au)
		{
			aud = au;
		}


		public void Draw() {
			System.out.println("      _________           \n "
							  +"   __|         |___       \n "
							  +"  |             ___|      \n "
							  +"     (_)        (_)        \n ");
		}
		
		@Override
		public String toString()
		{
			return "Учтённый автомобиль: " + String.valueOf(aud) + "\n" ;
		}
		@Override
		public String MASHINE() 		{
			return "Ауди";
		}

	}


