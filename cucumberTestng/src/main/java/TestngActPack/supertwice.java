package TestngActPack;

public class supertwice {
	
	supertwice()
	{
		
		System.out.println("parent 1");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superzero so = new superzero();
	}

}

class superone extends supertwice
{
	public void check1()
	{
		System.out.println("check1");
		
	}
}

class superzero extends superone
{

	public void check2()
	{
		System.out.println("check1");
		
	}
}



