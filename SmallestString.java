// Given N and K, find the lexicographically smallest string of length N using only the first K lowercase letters of the alphabet such that each letter is used at least once and no two adjacent characters are equal.

// If such a string doesn't exist, print -1.
// Input
// The first line of input contains a single integer, T (1 <= T <= 100).

// Then T lines follow, each containing two space-separated integers, N (1 <= N <= 105) and K (1 <= K <= 26).
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException{
	int t;
	Scanner sc = new Scanner(System.in);
	// InputStreamReader isr = new InputStreamReader(System.in);
	// BufferedReader br = new BufferedReader(isr);
	t = sc.nextInt();
	while(t>0){ 
		// String st[] = br.readLine().trim().split(" ");
		// int n = Integer.parseInt(st[0]);
		// int k = Integer.parseInt(st[1]);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(k==1){
				if(n>1){
					System.out.println(-1);
				}else {
					System.out.println('a');
				}
		} else if(n<k){
			System.out.println(-1);
		}else if(n==k){
			StringBuilder s = new StringBuilder();
			for(int i=0 ; i<k ; i++){
				s.append((char)('a'+i));
			}
			System.out.println(s);
		} else {
			StringBuilder s = new StringBuilder();
			for(int i=0 ; i<(n-k+2) ; i++){
				if(i%2 != 0){
					s.append('b');
				}else{
					s.append('a');
				}
			}
			for(int i=2 ; i<k ; i++){
				s.append((char)('a'+i));
			}
			System.out.println(s);
		}
		t--;
		}
	}
}
