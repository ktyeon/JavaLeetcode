
class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        
        // StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters.
        StringBuilder merged = new StringBuilder();
        
        int i = 0;
        int j = 0;
        
        // Loop until both strings have been completely processed
        while ( i < word1.length() || j < word2.length() ) {
            
            // Append character from word1 if available
            if (i < word1.length() ) {
                
                merged.append (word1.charAt(i));
                
                i++;
    
            }
            
            // Append character from word2 if available  
            if (j < word2.length() ) {
                
                merged.append (word2.charAt(j));
                
                j++;
                
            }
            
            
        }
        
        
        return merged.toString();
        
        
        
    }
}