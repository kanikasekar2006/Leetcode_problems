class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String str1[]=new String[str.length];
        
        for(String word:str){
           StringBuilder sb = new StringBuilder();
            int i=0;
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            else if(Character.isDigit(ch)){
                i=ch-'0';
            }
        }
        str1[i-1]=sb.toString();
    }
    return String.join(" ",str1);
}
}