package proj;

//Java implementation to count number of deletions 
//required from two strings to create an anagram 

class GFG { 

	final static int CHARS = 26; 

	static int countDeletions(String str1, String str2) { 
		int arr[] = new int[CHARS]; 
		for (int i = 0; i < str1.length(); i++) { 
			arr[str1.charAt(i) - 'a']++; 
		} 

		for (int i = 0; i < str2.length(); i++) { 
			arr[str2.charAt(i) - 'a']--; 
		} 

		int ans = 0; 
		for (int i = 0; i < CHARS; i++) { 
			ans += Math.abs(arr[i]); 
		} 
		return ans; 
	} 

	static public void main(String[] args) { 
		String str1 = "bcadeh", str2 = "hea"; 
		System.out.println(countDeletions(str1, str2)); 
	} 
} 

//This code is contributed by 29AjayKumar 

