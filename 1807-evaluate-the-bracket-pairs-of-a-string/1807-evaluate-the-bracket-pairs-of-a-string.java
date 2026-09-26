class Solution {
    public String evaluate(String s, List<List<String>> k) {
        HashMap<String,String> hs=new HashMap<>();
        for(int i=0;i<k.size();i++){
            hs.put(k.get(i).get(0),k.get(i).get(1));
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        int i=0;
        while(i<s.length()){

            if(s.charAt(i)=='('){
                int j=i+1;
                while(s.charAt(j)!=')'){
                    sb1.append(s.charAt(j));
                    j++;
                }
                if(hs.get(sb1.toString())!=null){
                sb.append(hs.get(sb1.toString()));
                }
                else{
                    sb.append("?");
                }
               sb1.setLength(0);
                i=j+1;
            }
               
            else{
                sb.append(s.charAt(i));
                i++;
            }
            
        }
        return sb.toString();
    }
}