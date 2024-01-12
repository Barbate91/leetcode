class problem1071 {

    public String gcdOfStrings(String str1, String str2) {
        // SOLUTION IS SLOW
        for (int i=0; i < str2.length(); i++) {
            String prefix = str2.substring(i);

            String str1AfterProcessing = removePrefixFromStr(str1,prefix);
            if (str1AfterProcessing == "") {
                String str2AfterProcessing = removePrefixFromStr(str2,prefix);
                if (str2AfterProcessing == "")
                    return prefix;
            }
        }
        return "";
    }

    private String removePrefixFromStr(String str, String prefix) {
        while (str.startsWith(prefix)) {
            str = str.substring(prefix.length(),str.length());
        }
        return str;
    }
}