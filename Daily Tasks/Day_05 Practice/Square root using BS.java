import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=1,r=n,ans=0;
    while(l<=r) {
      int b=(l+r)/2;
      if(b*b<=n) {
        ans=b;
        l=b+1;
      }
      else {
        r=b-1;
      }
    }
    System.out.print(ans);
  }
}