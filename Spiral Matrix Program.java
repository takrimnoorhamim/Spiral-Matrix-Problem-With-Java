import java.util.*;

 class Classss
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("matrix size: ");
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		System.out.println();
		
		
		System.out.println("Input elements: ");
		
		//input
		
		for(int i = 0; i < rows; i++){
		    
		    for(int j = 0; j < cols; j++){
		        
		        matrix[i][j] = sc.nextInt();
		        
		    } 
		    
		}

		System.out.println();
		
		
		//display
		
		System.out.println("Your Matrix: ");
		
		for(int i = 0; i < rows; i++){
		    
		    for(int j = 0; j < cols; j++){
		        
		        System.out.print( matrix[i][j] + " " );
		        
		    } 
		    
		    System.out.println();
		    
		}
		
		System.out.println();



		// spiral

		System.out.println("Spiral: ");

		int rs = 0;
		int re = rows - 1;
		int cs = 0;
		int ce = cols - 1;
		int count = 0;
		
		if (rows <= 0){

			return;

		}

		while (rows*cols > count){

			//right to left
			for (int i = cs; i <= ce && rows*cols > count; i++) {

				System.out.print( matrix[rs][i] + " ");
				count++;
				
			}

			rs++;


			//top to bottom
			for (int i = rs; i <= re && rows*cols > count; i++) {

				System.out.print( matrix[i][ce] + " ");
				count++;
				
			}

			ce--;


			// right to left
			for (int i = ce; i >= cs && rows*cols > count; i--) {

				System.out.print( matrix[re][i] + " ");
				count++;
				
			}

			re--;


			// bottom to top
			for (int i = re; i >= rs && rows*cols > count; i--) {

				System.out.print( matrix[i][cs] + " ");
				count++;
				
			}

			cs++;

		}
		
		
		
		
	}
}