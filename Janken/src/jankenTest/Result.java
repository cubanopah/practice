package jankenTest;

public class Result {

	   String result;
	   int rock = 0;
	   int scissors = 1;
	   int paper = 2;

	    public void result(int a, int b){

	        if(a == b){

	            result = "あいこです";

	        }else if((a == rock && b == scissors) || (a == scissors && b == paper ) ||
	        		(a == paper && b == rock )){

	        	result = "コンピュータの勝ち。あなたは負け";


	        }else if((a == rock && b == paper) || (a == scissors && b == rock ) ||
	        		(a == paper && b == scissors )){

	        	result = "あなたはの勝ち。コンピュータの負け";


	    }

	        System.out.println(result);

	}


}


