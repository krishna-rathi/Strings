import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int size=sc.nextInt();
    String arr[]=new String[size]; //array of strings
    for(int i=0; i<size; i++){
        arr[i]=sc.next();
    }
   
    String prefix=arr[0]; 
    for(int i=1; i<size; i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
    }
    if(prefix.isEmpty()==true){
        System.out.println("-1");
    }
    else 
        System.out.println(prefix);
}
}
