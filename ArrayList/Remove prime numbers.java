// Remove prime numbers from ArrayList

import java.util.*;
public class Classrooom{
    public static boolean isPrime(int val){
        for(int i =2; i<=val/2; i++){
            if(val % i ==0){
                return false;
            }
        }
        return true;
        
    }
    
    public static void removePrime(ArrayList<Integer> al){
        for(int i = al.size()-1; i>=0; i--){
            int val = al.get(i);
            if(isPrime(val) == true){
                al.remove(i);
            }
        }
    }
    
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(18);
        al.add(3);
        al.add(14);
        al.add(19);
        al.add(31);
        al.add(72);
        removePrime(al);
        System.out.println(al);
        
    }
}

//Output :- [18, 14, 72]
