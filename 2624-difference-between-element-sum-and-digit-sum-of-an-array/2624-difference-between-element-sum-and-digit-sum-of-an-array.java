class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int diff=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
               int num=nums[i];
               while(num>0){
                diff+=num%10;
                num/=10;
            }
        }
       return sum-diff; 
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        Solution b=new Solution();
        int n=scan.nextInt();
        int[] a =new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        System.out.println(b.differenceOfSum(a));
    }
}