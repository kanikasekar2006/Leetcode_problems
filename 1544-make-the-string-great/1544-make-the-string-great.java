class Solution {
    public String makeGood(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(list.size()>0){
              char last =list.get(list.size()-1);
              if(Character.toLowerCase(last)==Character.toLowerCase(ch)  && Character.isUpperCase(last) != Character.isUpperCase(ch)){
                list.remove(list.size()-1);
                continue;
              }
            }
            list.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:list){
            sb.append(c);
        }
        return sb.toString();
    }
}