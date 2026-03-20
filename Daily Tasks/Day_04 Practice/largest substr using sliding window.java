import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int l=0,mx=0;
        for(int r=0;r<s.length();r++) {
            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            mx=Math.max(mx,r-l+1);
        }
        System.out.print(mx);
    }
}
