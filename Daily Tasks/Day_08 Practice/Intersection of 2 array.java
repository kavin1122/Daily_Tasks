import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr1[]=new int[a];
        for(int i=0;i<a;i++) {
            arr1[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int arr2[]=new int[b];
        for(int i=0;i<b;i++) {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.print(""arr1[i]+" ");
                }
            }
        }
    }
}