package lr2;

import java.util.Hashtable;
import java.util.Vector;
import javax.swing.RowFilter.Entry;
import java.util.Optional;

public class ������� {
	Hashtable<�����, Vector<��������>> ����� =
			new Hashtable<�����, Vector<��������>>();
	private �������() { }
	public static ������� �������������() {
		������� res = new �������();
		����� ����� = new �����();
		�����.�������� = "���� �������";
		�����.�������� = "��������";
		�����.��� = "001";
		�����.������� = �������.��_������;
		�����.��������� = ���������.����;
		res.�����.put(�����, new Vector<>());
		
		����� = new �����();
		�����.�������� = "����� ������������";
		�����.�������� = "���������";
		�����.��� = "002";
		�����.������� = �������.����������;
		�����.��������� = ���������.�����;
		res.�����.put(�����, new Vector<>());
		
		return res;
	}
	
	public void �����(String ���������, �������� ��������) {
		Optional<java.util.Map.Entry<�����, Vector<��������>>>
		find = �����.entrySet().stream().filter(e->e.getKey().���.equals(���������)).findFirst();
		
		if (find.isPresent()) {
		if(find.get().getKey().������� == �������.�_�������) {
			find.get().getKey().������� = �������.��_������;
			find.get().getValue().add(��������);
			System.out.println("���� � �������");
		}
		else
			System.out.println("��� � �������");
	}
	else
		System.out.println("������ ���� ���");
	}
	
	public void �����(�������� ��������) {
		System.out.println("������� �� �����������");
	}
	
	public void �������() {
		�����.entrySet().stream().forEach(e->{
			����� tek = e.getKey();
			System.out.println(tek.�������� + "\n"+
			tek.�������� + "\n" + tek.��� + "\n");
		});
	}

}
