package lr7;


	public class Tovar {

		String naming;
		String kateg;
		float tsen;
		float skidka;
		float sama_skidka; 
		public Tovar(String n, String k, float t, float skid, float zapl)
		{
			naming=n;
			kateg= k;
			tsen = t;
			skidka=skid;
			sama_skidka=tsen-skidka;
		}
		
		@Override
		public String toString()
		{
			return "�������� ������: " + naming + "\n"+
					"���������: " + kateg + "\n"+
					"����: " + tsen + "\n"+
					"������� ������: " + skidka + "\n"+
					"���� �� �������: " + sama_skidka + "\n";
		}
		
		
	}