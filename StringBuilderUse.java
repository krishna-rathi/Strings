// Given a positive integer N, construct a string of length N such that no two adjacent characters are same. Among all possible strings, find the lexicographically minimum string.
// Note: You can use only lowercase characters from 'a' to 'z'.
// Input
// The first and the only line of input contains an integer N.
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n;
	n = sc.nextInt();
    StringBuilder s = new StringBuilder();
    for(int i=0;i<n;i++)
        s.append('a');
	for(int i=1;i<n;i+=2)
		s.setCharAt(i, 'b');
	System.out.println(s);
	}
}
