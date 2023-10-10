package leetcode;

public class HappyString {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 7;
        StringBuilder str = new StringBuilder();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int total = a+b+c;
        for (int i = 0; i < total; i++) {
            if(a >= b && a >= c && aCount < 2){
                str.append('a');
                aCount++;
                bCount = 0;
                cCount = 0;
                a--;
            }
            else if(b >= a && b >= c && bCount < 2){
                str.append('b');
                bCount++;
                aCount = 0;
                cCount = 0;
                b--;
            }
            else if(c >= a && c >= b && cCount < 2){
                str.append('c');
                cCount++;
                aCount = 0;
                bCount = 0;
                c--;
            }
        }
        System.out.println(str.toString());

    }
}
