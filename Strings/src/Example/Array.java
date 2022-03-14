package Example;

public class Array {

	private static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int[]prism=new int[5];
		  
		  prism[0]=21; prism[1]=19; prism[2]=70; prism[3]=35; prism[4]=50;
		  
		  for(int item:prism) { System.out.println(item); //Modern for loop }
		 
		
		  for(int i=0;i<prism.length;i++) { System.out.println(prism[i]); //traditional
		  for loop }
		 
///////////////////////////////////////////////////////////////
		//TO FIND A STATE FROM GIVEN ARRAY//
		
		  String[] states= {"delhi","mumbai","up","kerala","ap"}; String
		  target="kerala"; boolean found=false; for(String state:states) {
		  if(state.equals(target)) { found=true;
		  
		  }
		  
		  } if(found) { System.out.println("element is found");
		  
		  } else { System.out.println("element is not found");
		  
		  }
		 
////////////////////////////////////////////////
		//TWO DIMENSIONAL ARRAY//
		int prism[][]= {{12,22,3},{45,67,88},{45,12,90}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(prism[i][j]+"");
				
			}
			System.out.println();
		}
////////////////////////////////////////////////////////
		
		  int prism[][]= {{1,2,3},{4,5,6}}; int item[][]= {{5,7,8},{1,2,3}};
		  
		  int pmd[][]=new int[2][3];
		  for(int i=0;i<2;i++) {
			  for(int j=0;j<3;j++) {
		  
		         pmd[i][j]=prism[i][j]+item[i][j];
		   
		         System.out.println(pmd[i][j]+"");
		  }
		  
		  
		   System.out.println(); 
		  }
		  
		 

	}

}
