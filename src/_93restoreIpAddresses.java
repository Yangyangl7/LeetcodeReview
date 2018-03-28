import java.util.ArrayList;
import java.util.List;

//Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//
//For example:
//Given "25525511135",
//
//return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
public class _93restoreIpAddresses {
	public List<String> restoreIpAddresses(String s) {
		List<String> solution = new ArrayList<String>();
		dfs(s, solution, 0, 0, "");
		return solution;
	}
	
	private void dfs(String s, List<String> solution, int startIndex, int count, String stored) {
		if (count == 4) {
			if (startIndex == s.length()) {
				solution.add(stored);
			}
			else
				return;
		}
		
		for (int i = 1; i < 4; i++) {
			if (startIndex + i > s.length()) break;
			String part = s.substring(startIndex, startIndex + i);
			if (part.charAt(0) == '0' && part.length() > 1 || (Integer.parseInt(part) > 255)) continue;
			dfs(s, solution, startIndex + i, count + 1, stored + part + (count!=3?".":""));
		}
	}
}
