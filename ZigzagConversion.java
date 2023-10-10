package leetcode;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 3;
        StringBuilder[] sb = new StringBuilder[rows];
        for(int i = 0; i < rows; i++){
            sb[i] = new StringBuilder();
        }

        int index = 0;
        char[] ch = s.toCharArray();

        while(index < s.length()){
            for(int i = 0; i < rows && index < s.length(); i++){
                sb[i].append(ch[index++]);
            }

            for(int i = rows - 2; i > 0 && index < s.length(); i--){
                sb[i].append(ch[index++]);
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < rows; i++){
            result.append(sb[i].toString());
        }
        System.out.println(result.toString().equals("PAHNAPLSIIGYIR"));
    }
}
