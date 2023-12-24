// Check if One String Swap Can Make Strings Equal(Same as buddy string)
// T.c: O(N)
// S.C: O(1)

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //case1 :- s and goal have diff length
        if(s1.length()!= s2.length()){   
            return false;
        }
        //case1 :- s1 and s2 are equal return true
        if(s1.equals(s2)){ 
            return true;
        }   

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            //Case3:- if 2 strings have 2 different characters, see if we could swap them
            if(s1.charAt(i) != s2.charAt(i)){
                list.add(i);
            }
        }
    //check if arraylist have size of 2, and the 2 letters match with each other on different positions.
        return (list.size() == 2 
                && s1.charAt(list.get(0)) == s2.charAt(list.get(1))  //swap the numbers 
                && s1.charAt(list.get(1)) == s2.charAt(list.get(0)));    
    }
}
