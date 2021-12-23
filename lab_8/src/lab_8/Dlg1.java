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

public class Dlg1 extends JDialog{
	JEditorPane N = new JEditorPane(JEditorPane.DEFAULT_KEYMAP,
			"0");
	JEditorPane X = new JEditorPane(JEditorPane.DEFAULT_KEYMAP,
			"0");
	JEditorPane p = new JEditorPane(JEditorPane.DEFAULT_KEYMAP,
			"0");
	int n;
	float x,pp;
	public Dlg1(Dialog parent,String caption, boolean isModal, int axis)
	{
		
		super(parent, caption, isModal);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300,450);
		setVisible(true);
		Container cont = getContentPane();
		BoxLayout manager = new BoxLayout(cont, axis);
		cont.setLayout(manager);
		cont.add(new JLabel("N: "));
		cont.add(N);
		cont.add(new JLabel("X: "));
		cont.add(X);
		cont.add(new JLabel("p: "));
		cont.add(p);
		JButton btn = new JButton("OK");
		btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				n = getN();
				x = getXp();
				pp = getP();
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
	public float getXp()
	{
		float conv = Float.parseFloat(X.getText());
		return conv;
	}
	public float getP()
	{
		float conv = Float.parseFloat(p.getText());
		return conv;
	}

	public float Variant1(int n, float y)
	{
		float result=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				result+=(Math.pow(x, i)*Math.pow(pp, i-1))/factor(i+1);;
			}
			else result-=(Math.pow(x, i)*Math.pow(pp, i-1))/factor(i+1);
		}
		return result;
	}
	
	public static int factor(int ch)
	{
		int f=1;
		for (int i=2; i<=ch; i++)
		{
			f*=i;
		}
		return f;
	}
	
}
