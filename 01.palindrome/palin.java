import java.util.*;
class palin{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String n=sc.next();
        sc.close();
        String ans="";
        for(int i=n.length()-1;i>=0;i--){
            ans+=n.charAt(i);
        }
        if(n.equals(ans))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}