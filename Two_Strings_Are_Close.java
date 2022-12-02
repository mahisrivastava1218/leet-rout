class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(word1.length()!=word2.length()){
            return false;
        }
        int count[]=new int[26];
        int count1[]=new int[26];
        for(int i=0;i<n;i++){
            count[word1.charAt(i)-'a']++;
            count1[word2.charAt(i)-'a']++;
            
            
        }
        for(int i=0;i<26;i++){
            if(count[i]==0 && count1[i]>0 || count[i]>0 && count1[i]==0){
                return false;
            }
        }
        Arrays.sort(count);
        Arrays.sort(count1);
       
        return Arrays.equals(count,count1);
    }
}
