public class char_pattern {
    public static void main(String args[]){
        int val =65;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)val);
                val++;
            }
            System.out.println();
        }
    }
}
