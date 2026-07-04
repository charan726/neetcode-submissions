class Solution {

    public String encode(List<String> strs) {
        String encodedStr="";
        for(String s:strs){
            int n=s.length();
            char c = (char)(n + '0');
            encodedStr =encodedStr + c + s;
        }
        System.out.println(encodedStr);
        return encodedStr;
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        while(str.length() > 0){
            int size = str.charAt(0) - '0';
            ans.add(str.substring(1,size+1));
            str=str.substring(size+1);
            System.out.println(str.length());
        }
        return ans;
    }
}
