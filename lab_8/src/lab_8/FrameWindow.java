package lab_8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrameWindow extends JFrame {

	public FrameWindow(int axis)
	{super("������� 25");
	setSize(500,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container cont = getContentPane();
	BoxLayout manager = new BoxLayout(cont, axis);
	cont.setLayout(manager);
	cont.add(new JLabel("�������� ���������: "));
	JRadioButton var1 = new JRadioButton("��������� 1");
	cont.add(var1);
	JRadioButton var2 = new JRadioButton("��������� 2");
	cont.add(var2);
	JButton btn = new JButton("����������");
	JTextField answer = new JTextField("0");
	cont.add(answer);
	btn.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (var1.isSelected())
					{
						Dlg1 d1 = new Dlg1(null, "��������� 1", true, BoxLayout.Y_AXIS);
						d1.setVisible(true);
						answer.setText(String.valueOf(d1.Variant1(d1.n, d1.x)));
						
					}
					else if(var2.isSelected())
					{
						Dlg2 d2 = new Dlg2(null, "��������� 2", true, BoxLayout.Y_AXIS);
						d2.setVisible(true);
						answer.setText(String.valueOf(d2.Variant2(d2.getN(), d2.getR())));
						
					}
				}
			});
	cont.add(btn, BorderLayout.CENTER);		
}
	public static void main(String[] args) {
		FrameWindow window = new FrameWindow(BoxLayout.Y_AXIS);
		window.setVisible(true);}
}
