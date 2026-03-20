import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    int t=sc.nextInt();
    int l=0,r=n-1;
    while(l<=r) {
      int ans=(l+r)/2;
      if(arr[ans]==t) {
        System.out.println(ans);
        return;
      }
      else if(arr[ans]<t) {
        l=ans+1;
      }
      else {
        r=ans-1;
      }
    }
    System.out.println(-1);
  }
}