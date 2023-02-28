package Chapters.Chapter10;

public class P10_22 {

}

class MyString1{
    char[] chars;
    public MyString1(char[] chars){
        this.chars = chars;

    }

    public char charAt(int index){
        if (chars != null && chars.length > index){
            return chars[index];
        }else
            return ' ';
    }


}
