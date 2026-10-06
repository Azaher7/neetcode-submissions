class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        String reversed = "";

        for (int i = 0;i<s.length();i++){
            reversed = s.charAt(i) + reversed;
        }

        return (s.equalsIgnoreCase(reversed));
    }
}
