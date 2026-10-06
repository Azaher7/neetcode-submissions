class Solution {
    public void reverseString(char[] s){
        
        int count = s.length-1;
        boolean done = false;
    
        for (int i = 0;done!=true;i++){
            if(count!=i && count>0 && i<count){
                char temp;
                temp = s[count];
                s[count]=s[i];
                s[i] = temp;
                count--;
            }
            else{
                done = true;
            }
        }
    }
}