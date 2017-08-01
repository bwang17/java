public class StringManipulation {
    public String trimAndConcat(String str1, String str2) {
        return str1.trim() + str2.trim();
    }

    public Integer getIndexOrNull(String str1, char char1) {
        int index = str1.indexOf(char1);
        return index == -1 ? null : index;
    }

    public Integer getIndexOrNull(String str1, String str2) {
        int index = str1.indexOf(str2);
        return index == -1 ? null : index;
    }

    public String concatSubstring(String str1, Integer int1, Integer int2, String str2) {
        String substring = str1.substring(int1, int2);
        return substring + str2;
    }
}
