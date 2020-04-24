package proj;

public class Ex6 {
	public static void main(String[] args) {
		int x = 0, y = 10;
		try{
			y=y/x;
		}
		catch(Error e){
			System.out.println(e);
		}
	}
}
