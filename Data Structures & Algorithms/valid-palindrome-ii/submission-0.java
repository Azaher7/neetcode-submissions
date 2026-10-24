class Solution {
    public boolean validPalindrome(String s) {

        String[] strSplit = s.split("");

        ArrayList<String> str = new ArrayList<String>(Arrays.asList(strSplit));

        boolean valid = false;
        int count = 0;

        

        while (count<s.length()){

            ArrayList<String> test = new ArrayList<String>();
            ArrayList<String> reverse = new ArrayList<String>();

            for (int i = 0;i<str.size();i++){
                if (i!=count){
                    test.add(str.get(i));
                    reverse.add(str.get(i));
                }
            }

            Collections.reverse(reverse);

            System.out.println(test);
            System.out.println(reverse);
            
            if(test.equals(reverse)){
                valid = true;
                break;
            }
            count++;
            test.removeAll(test);
            reverse.removeAll(reverse);
        }
        return valid;
    }
}