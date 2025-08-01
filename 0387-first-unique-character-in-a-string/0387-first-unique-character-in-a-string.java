class Solution {
    public int firstUniqChar(String s) {
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(s.indexOf(ch)==s.lastIndexOf(ch)){
            return i;
        }
      }
      return -1;
  }
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    String s=scan.nextLine();
    Solution a=new Solution();
    System.out.println(a.firstUniqChar(s));
  }
}