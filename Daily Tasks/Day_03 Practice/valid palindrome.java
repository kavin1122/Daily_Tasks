import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase().replace(" ","");
        String rev="";
        for(int i=s.length()-1;i>=0;i--) {
            rev=rev+s.charAt(i);
        }
        System.out.print(s.equals(rev));
    }
}