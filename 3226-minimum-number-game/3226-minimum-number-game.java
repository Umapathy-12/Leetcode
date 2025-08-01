class Solution {
    public int[] numberGame(int[] nums) {
     Arrays.sort(nums);
     int n=nums.length;
     int[] result=new int[n];
     int index=0;
     for(int i=0;i<n;i=i+2){
        int alice=nums[i];
        int bob=nums[i+1];
        result[index++]=bob;
        result[index++]=alice;
     }
     return result;

    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Solution b=new Solution();
        int[] rs=b.numberGame(a);
        System.out.println(rs);
    }
}