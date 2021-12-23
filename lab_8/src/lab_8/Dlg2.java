package lab_8;

import java.awt.Container;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

public class Dlg2 extends JDialog {
	JEditorPane N = new JEditorPane(JEditorPane.DEFAULT_KEYMAP,
			"0");
	JEditorPane R= new JEditorPane(JEditorPane.DEFAULT_KEYMAP,
			"0");
	int n,r;
	
	public Dlg2(Dialog parent,String caption, boolean isModal, int axis)
	{
		super(parent, caption, isModal);
		setSize(300,450);
		setVisible(true);
		Container cont = getContentPane();
		BoxLayout manager = new BoxLayout(cont, axis);
		cont.setLayout(manager);
		cont.add(new JLabel("N"));
		cont.add(N);
		cont.add(new JLabel("R"));
		cont.add(R);
		JButton btn = new JButton("OK");
		btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				n = getN();
				r = getR();
				dispose();
			}
		});
		cont.add(btn);
	}
	
	
	public int getN()
	{
		int conv = Integer.parseInt(N.getText());
		return conv;
	}
	
	public int getR()
	{
		int conv = Integer.parseInt(R.getText());
		return conv;
	}
	
	public float Variant2(int n, int r)
	{
		float result=0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=r; j++)
			{
				result+=Math.pow(i+j, 2)/(Math.pow(i, 3)+Math.pow(j, 3));
			}
		}
		return result;
	}
}
