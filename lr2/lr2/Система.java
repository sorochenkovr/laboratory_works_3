package lr2;

import java.util.Hashtable;
import java.util.Vector;
import javax.swing.RowFilter.Entry;
import java.util.Optional;

public class Система {
	Hashtable<Товар, Vector<Заказчик>> товар =
			new Hashtable<Товар, Vector<Заказчик>>();
	private Система() { }
	public static Система Инициализация() {
		Система res = new Система();
		Товар новый = new Товар();
		новый.название = "Обои узорные";
		новый.материал = "флизелин";
		новый.код = "001";
		новый.наличие = Наличие.На_складе;
		новый.категория = Категория.Обои;
		res.товар.put(новый, new Vector<>());
		
		новый = new Товар();
		новый.название = "Дверь межкомнатная";
		новый.материал = "древесина";
		новый.код = "002";
		новый.наличие = Наличие.Отсутсвует;
		новый.категория = Категория.Двери;
		res.товар.put(новый, new Vector<>());
		
		return res;
	}
	
	public void Заказ(String кодТовара, Заказчик заказчик) {
		Optional<java.util.Map.Entry<Товар, Vector<Заказчик>>>
		find = товар.entrySet().stream().filter(e->e.getKey().код.equals(кодТовара)).findFirst();
		
		if (find.isPresent()) {
		if(find.get().getKey().наличие == Наличие.В_наличии) {
			find.get().getKey().наличие = Наличие.На_складе;
			find.get().getValue().add(заказчик);
			System.out.println("Есть в наличии");
		}
		else
			System.out.println("Нет в наличии");
	}
	else
		System.out.println("Такого кода нет");
	}
	
	public void Отказ(Заказчик заказчик) {
		System.out.println("Функция не реализована");
	}
	
	public void Каталог() {
		товар.entrySet().stream().forEach(e->{
			Товар tek = e.getKey();
			System.out.println(tek.название + "\n"+
			tek.материал + "\n" + tek.код + "\n");
		});
	}

}
