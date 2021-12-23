package lab_9;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FrameWindow extends JFrame{

	JList<String> ListN;
	JList<String> ListK;
	JTextField x;
	JTextField y;
	JTextField answer;
	public FrameWindow (int axis)
	{
		super("Вариант 25");
		setSize(300,450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		BoxLayout manager = new BoxLayout(cont, axis);
		cont.setLayout(manager);
		
		Vector<String> list1 = new Vector<String>();
		list1.add("5");
		list1.add("10");
		list1.add("15");
		list1.add("20");
		cont.add(new JLabel("N"));
		ListN = new JList<String>(list1);
		cont.add(ListN);
		ListN.setSelectedIndex(0);
		cont.add(new JLabel("K"));
		ListK = new JList<String>(list1);
		cont.add(ListK);
		ListK.setSelectedIndex(0);
		cont.add(new JLabel("x"));
		x = new JTextField("0");
		cont.add(x);
		cont.add(new JLabel("y"));
		y = new JTextField("0");
		cont.add(y);
		JButton btn = new JButton("Подсчитать: ");
		cont.add(btn);
		btn.addActionListener(new ChD());
		answer = new JTextField("0");
		cont.add(answer);
	}
	
	class ChD implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			Z();
		}
	}
	private void Z()
	{
		float result=0;
		int N = Integer.parseInt(ListN.getSelectedValue());
		int K = Integer.parseInt(ListK.getSelectedValue());
		float X = Float.parseFloat(x.getText());
		float Y = Float.parseFloat(y.getText());
		for (int i = 1; i<=N; i++)
		{
			for (int j = 1; j<=K; j++)
			{
				result+=(Math.sin(X)*Math.pow(X, i)+Math.cos(Y)*Math.pow(Y, j))/(i*j);
			}
		}
		answer.setText(String.format("%12.3f", result));
	}
	public static void main(String[] args) {
		
		FrameWindow window = new FrameWindow(BoxLayout.Y_AXIS);
		window.setVisible(true);
	}

}

