class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String str1[]=new String[str.length];
        
        for(String word:str){
            String sb="";
            int i=0;
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                sb=sb+ch;
            }
            else if(Character.isDigit(ch)){
                i=ch-'0';
            }
        }
        str1[i-1]=sb;
    }
    return String.join(" ",str1);
}
}