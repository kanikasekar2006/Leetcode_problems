class Solution {
    public int numDifferentIntegers(String word) {
        String str[]=word.split("[a-z]+");
        Set<String>set=new HashSet<>();
        for(String c:str){
           if(c.isEmpty()){
              continue;
           }
           String s=c.replaceAll("^0+","");
           if(s.isEmpty()){
            s="0";
           }
           set.add(s);
        }
           return set.size();
    }
}