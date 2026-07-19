class Solution {
    public boolean rotateString(String s, String goal) {
        boolean flag = false;
        if (s.equals(goal)) {
            return true;
        }
        else if (s.length() != goal.length()) {
            return false;
        }
        if (s.length() == goal.length()) {
            for (int i = 0; i < goal.length(); i++) {
                s = s.substring(1) + s.charAt(0);
                if (s.equals(goal)) {
                    flag = true;
                    return flag;
                }
            }
        }
        return flag;
    }
}