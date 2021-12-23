package lr6;
import lr6.lexus_enum;

public class Lexus implements IDraw{

	lexus_enum lex;
	public Lexus() {}
	public Lexus (lexus_enum l)
	{
		lex = l;
	}
	

	
	public void Draw()
	{
		System.out.println("      _________           \n "
				  +"   __|         |___       \n "
				  +"  |             ___|      \n "
				  +"     (_)        (_)        \n ");
	}
	
	@Override
	public String toString()
	{
		return "Направление: " + String.valueOf(lex) + "\n" ;
	}
	@Override
	public String MASHINE() 	{
		return "Менеджер";
	}
}
