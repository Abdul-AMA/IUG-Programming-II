public class test {
    public static void main(String[] args) {

        String x =  "AlioSSaWa";
        System.out.print(toLowerCaseaaaaa(x));
    }




    public static String toLowerCaseaaaaa(String chars){
        String newS  = "";
        char temp = ' ';
        if (chars != null){
            for (int i = 0; i < chars.length(); i++) {
                if (chars.charAt(i) >= 'A' && chars.charAt(i) <= 'Z'){
                    temp = (char) (chars.charAt(i) + ((int) 'a' - (int) 'A'));
                    newS += temp;

                }else{
                    newS += chars.charAt(i);
                }
            }

            return newS;
        }else
            return null;

    }





}
