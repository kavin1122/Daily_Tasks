import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++) {
            arr[i]=sc.nextInt();
        }
        int a=n*(n+1)/2;
        int b=0;
        for(int j=0;j<arr.length;j++) {
            b+=arr[j];
        }
        int c=a-b;
        System.out.print(c);
    }
}