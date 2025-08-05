class Solution {
    public int differenceOfSums(int n, int m) {
    int divi=0;
    int noDivi=0;
    for(int i=1;i<=n;i++){
        if(i%m==0){
            divi+=i;
        }
        if(i%m!=0){
        noDivi+=i;
    }
    }
    return noDivi-divi;
}
public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int m=scan.nextInt();
    Solution b=new Solution();
    System.out.println(b.differenceOfSums(n,m));

}
}