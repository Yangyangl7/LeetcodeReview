import java.util.HashMap;
import java.util.Map;

//Given a string, find the length of the longest substring without repeating characters.
//Examples:
//Given "abcabcbb", the answer is "abc", which the length is 3.
//Given "bbbbb", the answer is "b", with the length of 1.
//Given "pwwkew", the answer is "wke", with the length of 3. 
//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class _3longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> set = new HashMap<>();
        int tail = 0;
        int head = 0;
        int max = 0;
        
        if (s.length() == 0 || s == null)
        	return max;
        
        while (head < s.length()) {
        	if (set.containsKey(s.charAt(head))) {
        		tail = Math.max(tail, set.get(head)); //Never let the tail go back to a position 
        		                                      //that it has crossed. The most tricky part in this question.
        		set.remove(s.charAt(head));
        	}
        	set.put(s.charAt(head), head);
        	head = head + 1;
        	max = Math.max(head - tail, max);
        }
        
        return max;
	}
}
