package algoExpert;

import java.util.ArrayList;
import java.util.Arrays;

class Program {
	  int filled =0;
	  public ArrayList<ArrayList<Integer>> solveSudoku(ArrayList<ArrayList<Integer>> board) {  
	    // Write your code here.
	    filled = findfilledNum(board);

	     for(int i=1;i<board.size(); i++){
	      for(int j=1;j<board.size(); j++){
	              findNumber(board, i, j);
	        }
	    }
	    
	    System.out.println(filled);
	    
	    return new ArrayList<ArrayList<Integer>>();
	  }

	  public void findNumber(ArrayList<ArrayList<Integer>> board, Integer row, Integer col){
	    Integer arr[] = {1,2,3,4,5,6,7,8,9};
	    ArrayList<Integer> possibleNum = new ArrayList<>(Arrays.asList(arr));
	    
	    
	    for(int i=1;i<board.size(); i++){
	      for(int j=1;j<board.size(); j++){
	          Integer currentNum = board.get(i).get(j);
	          Integer groupRow=i/3 +1;
	          Integer groupCol=j/3 +1;
	          if(i != row && j != col){
	            continue;
	          }else if(i != row && j == col){            
	            if(currentNum !=0)
	                possibleNum.remove(currentNum);
	          }else if(i == row && j != col){
	            possibleNum.remove(currentNum);
	          }
	          if ((i >= groupRow*3) && (i <= groupRow*3 +3) && (j >= groupCol*3) && (j <= groupCol*3 +3) ) {
	            possibleNum.remove(currentNum);
	          }
	        
	        }
	    }
	    if(possibleNum.size()==1){
	        System.out.println( row+"--" + col +"--"+ possibleNum.get(0) );
	      
	    }
	      
	    
	  }
	  
	  public int findfilledNum(ArrayList<ArrayList<Integer>> board){
	    for(ArrayList<Integer> row: board){
	      for(Integer cell: row){
	          if (cell !=0){
	            filled += 1;
	            }
	        }
	    }
	    return filled;
	  }
	}
