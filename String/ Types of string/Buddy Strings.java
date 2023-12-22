// Buddy Strings
// T.c: O(N), where N is the length of N
// S.C: O(1)

class Solution {
    public boolean buddyStrings(String s, String goal) {
        //case1 :- s and goal have diff length
        if(s.length()!= goal.length()){   
            return false;
        }

        //case2:- if 2 strings are equal, and if there exists the same character within then, 
        // check freq of characters
        if(s.equals(goal)){ 
            return checkFreq(s);
        }   

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            //Case3:- if 2 strings have 2 different characters, see if we could swap them
            if(s.charAt(i) != goal.charAt(i)){
                list.add(i);
            }
        }
        //check if arraylist have size of 2, and the 2 letters match with each other on different positions.
        return (list.size() == 2 
                && s.charAt(list.get(0)) == goal.charAt(list.get(1))  //swap the numbers 
                && s.charAt(list.get(1)) == goal.charAt(list.get(0)));
    }

    //check freq
    // whenever we see any of the slot has value of 2, we immediately return true: 
    private boolean checkFreq(String s){
        int freq[]=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a'] > 1){
                return true;
            }
        }
        return false;   
    }
}
