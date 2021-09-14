// Sara's brother gives her a string representing chocolates and candies in a row. Sara loves eating candies before chocolates so she wants to rearrange the given string so that all the candies come before chocolates. Help her to rearrange the string.
// You are allowed only 1 type of operation as many times as you want. You can swap all existing pair of candy and chocolate in a second if they are consecutive and chocolate is before candy, that means in one second you can swap all the i-th value with i+1 if and only if the i-th position has chocolate and the i+1 has candy.
// Given the String S, find the minimum time needed to rearrange the given string.
// Note:- String will contain only characters 'M' and 'F' where M represents chocolate while F represents candy.
// Print the minimum time needed to rearrange the given string such that all candies come before chocolates.
// Sample Input:-
// MMFF

// Sample Output:-
// 3

// Explanation:-
// MMFF - > MFMF - > FMFM - > FFMM

// Sample Input:-
// MFMFMF

// Sample Output:-
// 3

// Explanation:-
// MFMFMF -> FMFMFM -> FFMFMM -> FFFMMM
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//example FFMF, FFFMMM
class Main {
	public static void main (String[] args) throws IOException {
        String s;
        //Scanner sc = new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);  
        s = br.readLine();  
        //s = sc.next();
        int c=0, t=0;//candies and traversals
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'F'){
                if(i-c<=t && t!=0) 
                    t++;
                else   
                    t=i-c;
            c++;
            }
        }
        System.out.println(t);
        }
	}
