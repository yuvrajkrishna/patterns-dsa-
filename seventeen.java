public class seventeen {
    public static void main (String args []) {

        int n = 5; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0  ; j < n - i ; j++){
                System.out.print(" ");
            }
            for(char ch = 'A' ; ch<'A'+ i;ch++){
                System.out.print(ch);
            }

            for(char ch = 'A' ; ch<'A'+ i;ch++){
                System.out.print(ch);
            }

            System.out.println();

        }

    }
}
