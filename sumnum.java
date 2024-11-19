public class sumnum {

        public static void main(String[] args) {
        int num = 2415;
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numStr.length() - 1; i++) {
        int number = Integer.parseInt(numStr.substring(i, i + 2));
        sum += number;
        }
        System.out.println("Sum: " + sum);
        }
       }
       

