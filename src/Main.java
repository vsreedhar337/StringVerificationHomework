public class Main {

    public static boolean abcTest(String str) {
        if(str.indexOf(".abc") != -1) {
            return false;
        }else if(str.indexOf("abc") != -1) {
            return true;
        }
        return false;
    }

    public static String alternateStrings(String str1, String str2) {
        String output = "";
        int biggestLength = Math.max(str1.length(), str2.length());
        for(int i = 0; i < biggestLength; i++) {
            if(i < str1.length()) {
                output += str1.substring(i,  i+1);
            }
            if(i < str2.length()) {
                output+= str2.substring(i,  i+1);
            }
        }
        return output;
    }
}
