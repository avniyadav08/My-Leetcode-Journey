class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        String word=s+s;
        return word.contains(goal);
    }
}