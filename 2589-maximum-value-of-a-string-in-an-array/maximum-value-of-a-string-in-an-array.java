class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        
        for (String s : strs) {
            int val;
            
            // Check if the string is numeric
            if (isNumeric(s)) {
                val = Integer.parseInt(s);
            } else {
                val = s.length();
            }
            
            maxVal = Math.max(maxVal, val);
        }
        
        return maxVal;
    }
    
    // Helper function to check if a string is numeric
    private boolean isNumeric(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
