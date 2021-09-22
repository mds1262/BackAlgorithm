package level.level7;

import java.util.Scanner;

/**
 * 
 * @author deuksoomoon
 * 기준이 되는 문자열을 정하
 * 해당 문자열이 포함될경우 공백으로 치환
 */
public class CroatiaAlphabet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
				
		scan.close();
		
	    String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
	    
	    for(int i=0;i<arr.length;i++) {
	        if(S.contains(arr[i])) {
	            S=S.replaceAll(arr[i]," ");
	            }
	        }   
	    System.out.println(S.length());
		
	}
}
