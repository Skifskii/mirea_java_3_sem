package prac_7.subprac_5;

public class StringToolsClass implements StringTools {
    private String s;

    public StringToolsClass(String s) {
        this.s = s;
    }

    @Override
    public int lenST() {
        return s.length();
    }

    @Override
    public String oddST() {
        String newS = "";
        for (int i = 1; i < s.length(); i+=2) {
            newS += s.charAt(i);
        }
        return newS;
    }

    @Override
    public String invertST() {
        String newS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newS += s.charAt(i);
        }
        return newS;
    }
}
