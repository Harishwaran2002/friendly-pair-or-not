import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum1=sum1+i;
            } 
        }
        for(int j=1;j<b;j++)
        {
            if(b%j==0)
            {
                sum2=sum2+j;
            }
        }
        if(a/sum1==b/sum2)
        {
        System.out.println("Friendly Pair");
        }else{
        System.out.println("Not Friendly Pair");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
