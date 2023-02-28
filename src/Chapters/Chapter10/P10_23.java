package Chapters.Chapter10;

public class P10_23 {
    public static void main(String[] args) {


        MyString2 myString2 = new MyString2("alibaba AAAAAA");

        System.out.print(myString2.toUpperCase().getS());

    }
}

class MyString2{

    String s ;

    public String getS() {
        return s;
    }

    public MyString2(String s){
        this.s = s;
    }

    public int compare(String s){
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (this.s.charAt(i) != s.charAt(i)){
                num = (int) (this.s.charAt(i) - s.charAt(i));
            }
        }

        return num;
    }

    public MyString2 substring(int begin){
        String newS = "";
        for (int i = begin; i <this.s.length() ; i++) {
            newS+= this.s.charAt(i);
        }
        return new MyString2(newS);
    }

    public MyString2 toUpperCase(){
        String newS = "";
        for (int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) >= 'a' && this.s.charAt(i) <= 'z'){
                newS += (char) (this.s.charAt(i) - ((int) ('a' -  'A')));
            }else
                newS += this.s.charAt(i);
        }




        return new MyString2(newS);
    }


    public char[] toChars(){

        char [] chars = new char[this.s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2("true") : new MyString2("false");
    }






}
