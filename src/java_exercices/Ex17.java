//Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
//(inclusive);

package java_exercices;

import java.util.ArrayList;

public class Ex17 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		
		for(int i = 0; i < 80; ++i)
		{
			arr_list.add(i);
		}
		
		for( int i : arr_list) {
			if(i >= 10 && i <= 150) {
				System.out.println(i);
			}
		}
	}

}
