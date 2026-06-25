class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>,List<String>> map = new HashMap<>();
        for(String s:strs){
            List<Integer> l=new ArrayList<>(Collections.nCopies(26, 0));
            for(int i=0;i<s.length();i++){
                int tem = s.charAt(i) - 'a';
                int ct = l.get(tem);
                l.set(tem,ct+1);
            }
            List<String> ls=map.getOrDefault(l,new ArrayList<>());
            ls.add(s);
            map.put(l,ls);
        }
        return new ArrayList<>(map.values());
    }
}
