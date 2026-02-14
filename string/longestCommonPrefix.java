class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // take the first word as initial prefix
        String prefix = strs[0];

        // check prefix with every other string
        for (int i = 1; i < strs.length; i++) {
            // while current string does not start with prefix, shorten prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
