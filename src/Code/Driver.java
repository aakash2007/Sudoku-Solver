package Code;


import Code.Sudoku;


public class Driver {

    
        public static class GridClass{
            
            Integer[][] ansgrid = {	{8, 0, 0, 0, 0, 0, 0, 0, 0},
                 			{0, 0, 3, 6, 0, 0, 0, 0, 0},
                 			{0, 7, 0, 0, 9, 0, 2, 0, 0},
                 			{0, 5, 0, 0, 0, 7, 0, 0, 0},
                 			{0, 0, 0, 0, 4, 5, 7, 0, 0},
                 			{0, 0, 0, 1, 0, 0, 0, 3, 0},
                 			{0, 0, 1, 0, 0, 0, 0, 6, 8},
                 			{0, 0, 8, 5, 0, 0, 0, 1, 0},
                 			{0, 9, 0, 0, 0, 0, 4, 0, 0}     };
        };
        
	public static void main(String[] args) {
		Sudoku S = new Sudoku();
                GridClass g11 = new GridClass();
		 Integer[][] grid1 = {	{8, 0, 0, 0, 0, 0, 0, 0, 0},
                 			{0, 0, 3, 6, 0, 0, 0, 0, 0},
                 			{0, 7, 0, 0, 9, 0, 2, 0, 0},
                 			{0, 5, 0, 0, 0, 7, 0, 0, 0},
                 			{0, 0, 0, 0, 4, 5, 7, 0, 0},
                 			{0, 0, 0, 1, 0, 0, 0, 3, 0},
                 			{0, 0, 1, 0, 0, 0, 0, 6, 8},
                 			{0, 0, 8, 5, 0, 0, 0, 1, 0},
                 			{0, 9, 0, 0, 0, 0, 4, 0, 0}     };
		 
		 Integer[][] grid2={     {0,6,7,2,0,0,9,0,0},
	                		 {1,0,0,0,0,9,6,0,0},
	                		 {0,0,0,1,0,0,0,4,0},
	                		 {0,0,4,5,0,0,0,3,9},
	                		 {0,0,0,0,0,0,0,0,0},
	                		 {9,8,0,0,0,3,4,0,0},
	                		 {0,7,0,0,0,4,0,0,0},
	                		 {0,0,2,9,0,0,0,0,1},
	                		 {0,0,9,0,0,1,3,2,0}  };

                 
                /*
                 Sudoku.solve(g11);
                 
                 int i,j;
                 for(i=0;i<9;i++)
                    {
                        System.out.println("");
                            for(j=0;j<9;j++)
                            {  System.out.printf(" %d ", g11.ansgrid[i][j]);  }
                    }
                 */
	}

}
