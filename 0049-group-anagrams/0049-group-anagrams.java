class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char c[]=strs[i].toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(hm.containsKey(key)){
                hm.get(key).add(strs[i]);
            }
            else{
                List<String>list=new ArrayList<>();
                list.add(strs[i]);
                hm.put(key,list);
            }
        }
        return new ArrayList<>(hm.values());
    }
}