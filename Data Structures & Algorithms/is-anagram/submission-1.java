class Solution {
    public boolean isAnagram(String s, String t) {
        /*if(s.length() != t.length()){
            return false;
        }
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray , tArray);*/
        //--------OPTIMAL-------
         if (s.length() != t.length()) {
            return false;
        }
        int cnt[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            cnt[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
