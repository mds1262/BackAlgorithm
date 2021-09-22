package greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostParenthesis {

    public static void main(String[ ] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        String[] cal = s.split("-");
        
        int[] number = new int[cal.length];
        
        for(int i=0; i<cal.length; i++){
            if(cal[i].contains("+")){
                String[] temp = cal[i].split("\\+");
                for(int j=0; j<temp.length; j++){
                    number[i]+=Integer.parseInt(temp[j]);
                }
            }
            else{
                number[i] = Integer.parseInt(cal[i]);
            }
        }
        
        int sum = number[0];
        for(int i=1; i<number.length; i++){
            sum-=number[i];
        }
        
        System.out.println(sum);
    }
}
