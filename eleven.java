public class eleven {
    public static void main ( String args [] ) {
        int n = 5 ;
        for(int i = 0; i < n ; i++ ){
            int stars = 1;
            if(i % 2 == 0){
                 stars = 1;
            }
            else{
            stars = 0;
            }
            for(int j = 0 ; j <= i ; j++){
                System.out.print(stars +  " ");
                stars = 1 - stars;
                
            }
            System.out.println();
        }
    }
}