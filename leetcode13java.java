//leet13
import java.util.HashMap;
public class leetcode13 {
    public static void main(String[] args) {
    Integer sol = solution("MCMXCIV");
    System.out.println(sol);
    }
    
    static int solution(String s){
    HashMap<String,Integer> numerals = new HashMap<>();
    numerals.put("I",1);
    numerals.put("V",5);
    numerals.put("X",10);
    numerals.put("L" ,50);
    numerals.put("C",100);
    numerals.put("D" ,500);
    numerals.put("M" ,1000);
    Integer total_sum = 0;
    Integer temp_sum = 0;
    if(s.length() == 1){
        return(numerals.get(""+s.charAt(0)));
    }
    else{

    
    
    for (int i=0; i<s.length();i++){
        Integer curr_value = numerals.get("" + s.charAt(i));
        if (i == 0){
            temp_sum += curr_value;
        }
        else{
           Integer prev_value = numerals.get(""+s.charAt(i-1));
           if(prev_value > curr_value){
            total_sum += temp_sum;
            temp_sum = 0;
            temp_sum += curr_value;
        }
        else if(prev_value < curr_value){
            temp_sum = curr_value - temp_sum;

        }
        else{
            temp_sum += curr_value;
        }
        if (i == s.length() -1){
            total_sum += temp_sum;
        }
        }
        
        
       

        
        }
        return(total_sum);


    }
}
}