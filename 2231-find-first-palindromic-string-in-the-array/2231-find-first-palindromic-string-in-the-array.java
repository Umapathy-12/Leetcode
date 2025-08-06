class Solution {
    public String firstPalindrome(String[] words) {
      for(String word:words){
        String rev=new StringBuilder(word).reverse().toString();
        if(word.equals(rev)){
            return word;
        }
    }
     return "";
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        Solution a=new Solution();
        int size=scan.nextInt();
        String[] word=new String[size];
        for(int i=0;i<size;i++){
            word[i]=scan.nextLine();
        }
        System.out.println(a.firstPalindrome(word));
    }
}