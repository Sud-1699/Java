/******************************************************************************
 Check validity of sudoku problem:
 Determine if a 9 x 9 Sudoku board is valid.
 The rules that need to be checked if the Sudoku grid is valid are :
 1.Each row must contain the digits 1-9 without repetition.
 2.Each column must contain the digits 1-9 without repetition.
 3.Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

 Example 1 :
 {{'5','3','.','.','7','.','.','.','.'},
 {'6','.','.','1','9','5','.','.','.'},
 {'.','9','8','.','.','.','.','6','.'},
 {'8','.','.','.','6','.','.','.','3'},
 {'4','.','.','8','.','3','.','.','1'},
 {'7','.','.','.','2','.','.','.','6'},
 {'.','6','.','.','.','.','2','8','.'},
 {'.','.','.','4','1','9','.','.','5'},
 {'.','.','.','.','8','.','.','7','9'}}
 Output: true

 Example 2 :
 {{'8','3','.','.','7','.','.','.','.'},
 {'6','.','.','1','9','5','.','.','.'},
 {'.','9','8','.','.','.','.','6','.'},
 {'8','.','.','.','6','.','.','.','3'},
 {'4','.','.','8','.','3','.','.','1'},
 {'7','.','.','.','2','.','.','.','6'},
 {'.','6','.','.','.','.','2','8','.'},
 {'.','.','.','4','1','9','.','.','5'},
 {'.','.','.','.','8','.','.','7','9'}}
 Output: false

 *******************************************************************************/

public class Sudoku
{
    public static void main(String[] args) {
        char[][] inputSudoku = new char[][]
                {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        //Expected answer is : true

        boolean isSudokuValid = checkSudokuValidity(inputSudoku);
        System.out.println("Is given sudoku problem vablid ? : " + isSudokuValid);
    }

    static boolean checkSudokuValidity(char[][] inputSudoku){
        int rl = 0, rh = inputSudoku.length - 1;
//        Set<Character> unqiue = new HashSet<>();
        while(rl < rh) {
//            int cl = 0, ch = inputSudoku[l].length - 1;
//            while(cl < ch) {
                //if(cl == ch) {
                //    cl += 1;
                //    ch = inputSudoku[l].length - 1;
                //}

                //if((inputSudoku[rl][cl] == '.')) { // 00 == '.'
                //    cl += 1;
                //}
                //if((inputSudoku[rl][ch] == '.')) {
                //    ch -= 1;
                //}

    	      /* if(inputSudoku[rl][cl] == inputSudoku[rl][ch]) {
    	           return true;
    	       }*/

//                if(unqiue.contain(inputSudoku[rl][cl]))
//
//                    ch -= 1;
            }


//        }

        return false;
    }
}