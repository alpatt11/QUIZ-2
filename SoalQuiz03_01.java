public class SoalQuiz03_01 {
    public static void main(String[] args) {
        
        char[][] arr = {
            {'I', 'N', 'F', 'O', 'R'},
            {'M', 'A', 'T', 'I', 'K'},
            {'A', 'P', 'O', 'L', 'I'},
            {'N', 'E', 'M', 'A', 'M'}
        };
        
        
        for (int i = 0; i < arr.length; i++) {
            char maxChar = arr[i][0];  
            int maxCol = 0;            
            
            
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > maxChar) {
                    maxChar = arr[i][j];
                    maxCol = j;
                }
            }
            
            
            System.out.printf("%c adalah huruf terbesar pada baris %d berada di kolom %d\n", 
                            maxChar, i + 1, maxCol + 1);
        }
    }
}