package proj;

import java.util.ArrayList;
import java.util.List;

public class Ba {
	
	public int reverse(int number){
		int reverse=0;
		while(number!=0){
			reverse = (reverse*10)+(number%10);
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		
		
		Ba bb=new Ba();

	}
}
