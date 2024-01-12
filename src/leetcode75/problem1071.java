class problem1071 {

    public String gcdOfStrings(String str1, String str2) {
        //LOGIC IS MISSING FOR STR2 TO ALSO DIVIDE BY ITSELF
        String strToParse = str1;
        for (int i=0; i < str2.length(); i++) {
            String prefix = str2.substring(i);

            while (strToParse.startsWith(prefix)) {
                strToParse = strToParse.substring(prefix.length(),strToParse.length());
            }
            if (strToParse == "")
                return prefix;
        }
        return "";
    }
}