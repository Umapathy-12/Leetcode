import java.util.*;
public class Solution{
    public int addDigits(int num){
        while(num>=10){
            int sum=0;
            while(num>0){
                sum+= num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Solution myObj=new Solution();
        System.out.println(myObj.addDigits(38));
    }
}