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
			return "Название товара: " + naming + "\n"+
					"Категория: " + kateg + "\n"+
					"Цена: " + tsen + "\n"+
					"Процент скидки: " + skidka + "\n"+
					"Цена со скидкой: " + sama_skidka + "\n";
		}
		
		
	}