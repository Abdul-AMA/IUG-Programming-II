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

    public int length(){
        if (chars != null){
            return chars.length;
        }else
            return 0;
    }

    public MyString1 substring(int begin, int end){
        char newS [] = new char[end-begin];
        if (chars!= null && chars.length >= end){
            for (int i = 0; i < end-begin; i++) {
                newS[i] = chars[begin+i];
            }
            return new MyString1(newS);
        }else
            return null;


    }

    public MyString1 toLowerCase(){
        char newS [] = new char[chars.length];
        char temp = ' ';
        if (chars != null){
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z'){
                    temp = (char) (chars[i] + ((int) 'a' - (int) 'A'));
                    newS[i] = temp;

                }else{
                    newS[i] = chars[i];
                }
            }

            return new MyString1(newS);
        }else
            return null;

    }



    public boolean equals(MyString1 s){
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != s.chars[i]){
                return false;
            }
        }
        return true;
    }






}