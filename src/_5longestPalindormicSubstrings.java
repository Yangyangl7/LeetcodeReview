//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
//Example 1:
//
//Input: "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
//Example 2:
//
//Input: "cbbd"
//Output: "bb"
public class _5longestPalindormicSubstrings {
	public String longest(String s) {
		int startIndex = 0;
		int maxlength = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int l1 = findLength(s, i, i); //odd string length
			int l2 = findLength(s, i, i+1);//even string length
			int update = Math.max(l1, l2);
			
			if (update > maxlength) {
				maxlength = update;
				startIndex = l1 == update? i - maxlength / 2: i - maxlength /2 + 1; 
			}
		}
		
		return s.substring(startIndex, startIndex + maxlength);
	}
	
	public int findLength(String s, int Left, int Right) {
		int L = Left;
		int R = Right;

		while (L > -1 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		
		return R - L - 1;
	}
}
