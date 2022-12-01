class Solution {
    private boolean vowels(char ch){
        return(ch=='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u' || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U');
    }
    public boolean halvesAreAlike(String s) {
       
        int count=0;
        int count1=0;
        for(int i=0;i<s.length()/2;i++){
            if(vowels(s.charAt(i))){
                count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(vowels(s.charAt(i))){
                count1++;
            }
        }
        if(count==count1){
            return true;
        }else{
            return false;
        }
        
    }
}
