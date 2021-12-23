package lr6;

 import lr6.Hyndai_enum;
 public class Hyundai implements IDraw{

	 Hyndai_enum hyun;
	public Hyundai() {}
	public Hyundai (Hyndai_enum h)
	{
		hyun = h;
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
		return "Направление: " + String.valueOf(hyun) + "\n" ;
	}
	@Override
	public String MASHINE() {
			return "Менеджер";
		
	}

}
