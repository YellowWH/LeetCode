class Solution {
    public int romanToInt(String s) {
        int res=0;
        HashMap<Character,Integer> m = new HashMap();
        m.put('M',1000);m.put('D',500);m.put('C',100);m.put('L',50);m.put('X',10);m.put('V',5);m.put('I',1);
        for(int i=0;i<s.length();i++){
            int j=m.get(s.charAt(i));
            if(i==s.length()-1||m.get(s.charAt(i))>=m.get(s.charAt(i+1))){
                res+=j;
            }
            else res-=j;
        }
        return res;

    }
}

