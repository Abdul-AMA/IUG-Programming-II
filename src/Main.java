public class Main {
    public static void main(String[] args) {
        double n = Math.pow(10,-19);
        for (int i = 0; i < 999999999; i++) {
            double result = ((1000*n) +(0.026*Math.log(n/(Math.pow(10,-16)))));
            System.out.println(result);
            if (result>=0){
                System.out.println("result: " + result);
                System.out.println(n + "     we won");
                System.exit(1);
            }
            n+=.00000000000000000001;
        }
//        for (int i = 0; i < 999999999; i++) {
//            double result = ((1000*n) +(0.026*Math.log(n/(Math.pow(10,-16)))));
//            if (result == 0){
//                System.out.println(n);
//                System.exit(1);
//            }
//            n+=.000000000000000001;
//        }
//        for (int i = 0; i < 999999999; i++) {
//            double result = ((1000*n) +(0.026*Math.log(n/(Math.pow(10,-16)))));
//            if (result == 0){
//                System.out.println(n);
//                System.exit(1);
//            }
//            n+=.000000000000000001;
//        }
//        for (int i = 0; i < 999999999; i++) {
//            double result = ((1000*n) +(0.026*Math.log(n/(Math.pow(10,-16)))));
//            if (result == 0){
//                System.out.println(n);
//                System.exit(1);
//            }
//            n+=.000000000000000001;
//        }
//        for (int i = 0; i < 999999999; i++) {
//            double result = ((1000*n) +(0.026*Math.log(n/(Math.pow(10,-16)))));
//            if (result == 0){
//                System.out.println(n);
//                System.exit(1);
//            }
//            n+=.000000000000000001;
//        }
//        for (int i = 0; i < 999999999; i++) {
//            double result = ((1000*n) +(0.026*Math.log(n/(Math.pow(10,-16)))));
//            if (result == 0){
//                System.out.println(n);
//                System.exit(1);
//            }
//            n+=.000000000000000001;
//        }


        }
}