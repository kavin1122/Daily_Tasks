import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,temp=n;
        while(n!=0) {
            rev=rev*10+n%10;
            n=n/10;
        }
        boolean isPalindrome=(temp==rev);
        System.out.print(isPalindrome);
    }
}