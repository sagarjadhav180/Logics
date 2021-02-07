package org.com.automation.practise;

import org.testng.annotations.Test;

public class pattern_programing {

	
	@Test(enabled=false)
	public void test1(){
		int rows=4;
		int star=1;
		int hash=4;
		//for odd
		//for even
		
		for(int i=1;i<rows;){
			if(i%2!=0){
				for(int j=1;j<star+1;j++){
					System.out.print("*");
				}
				for(int k=1;k<hash+1;k++){
					System.out.print("#");
				}
			}
			else if(i%2==0){
				
				for(int l=1;l<hash+1;l++){
					System.out.print("#");
				}
				for(int m=1;m<star+1;m++){
					System.out.print("*");
				}
			}
			System.out.println();
			star++;
			hash--;
			i++;	
		}
			
	}
	
	@Test(enabled=false)
	public void test2(){
	
		int rows=5;
		int star=5;
		int space=0;
		int mid=(rows+1)/2;
		
		for(int i=1;i<rows+1;i++){
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<star;k++){
				System.out.print("*");
			}
			System.out.println();
			if(i<mid){
			star=star-2;
			space++;
			}
			else {
				star=star+2;
				space--;
			}
		}
		 
	}	
	
	@Test(enabled=false)
	public void test3()
	{		
		int rows=5;
		int star=1;
	
		for(int i=1;i<rows+1;i++){
			for(int j=1;j<star+1;j++){
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
	}
		
	
	}
	
	
	@Test(enabled=false)
	public void test4(){
		
		int rows=7;
		int count=1;
		
		for(int k=1;k<rows+1;k++){
		for(int i=1;i<count+1;i++){
			System.out.print(i);
		}
		
		System.out.println();
		count++;
		}		
	}
	
	
	@Test(enabled=false)
	public void test5(){
		int rows=13;
		int count=1;
		int mid=(rows+1)/2;
		
		for(int k=1;k<rows+1;k++){
		for(int i=1;i<count+1;i++){
			System.out.print(i);
		}
		
		System.out.println();
		if(k<mid){
			count++;
		}
		else{
			count--;
		}
		 
		}		
	}
		@Test(enabled=false)
		public void test6(){
			
			int rows=7;
			int count=1;
			
			for(int i=1;i<rows+1;i++){
				for(int k=1;k<count+1;k++){
					System.out.print(count);
				}
				System.out.println();
				count++;
			}
		}	
		
		
		@Test(enabled=false)
		public void test7(){
			
			int rows=7;
//			int count=7;
			
			for(int i=1;i<rows+1;i++){
				for(int j=7;j>i-1;j--){
				System.out.print(j);
					
				}

				System.out.println();
//				count--;
				
				
			}
		}		
		
		
		
		@Test(enabled=false)
		public void test8(){
			
			int rows=7;
			int count=7;
			
			for(int i=1;i<rows+1;i++){
				for(int j=1;j<count+1;j++){
				System.out.print(j);
					
				}

				System.out.println();
				count--;
				
				
			}
		}		
		
		
		
		@Test(enabled=false)
		public void test9(){
			
			int rows=7;
			int count=7;
			
			for(int i=1;i<rows+1;i++){
				for(int j=count;j>0;j--){
				System.out.print(j);
					
				}

				System.out.println();
				count--;
				
				
			}
		}				
		
		
		@Test(enabled=false)
		public void test10(){
			
			int rows=7;
			int count=1;
			int cl=7;
			
			for(int i=1;i<rows+1;i++){
				for(int j=7;j>cl-1;j--){
					System.out.print(j);
				}
				System.out.println();
				cl--;
				count++;
			}
		}		
		
		
		@Test(enabled=false)
		public void test11(){
			
			int rows=7;
			int count_a=1; 
			int count_b=0;
			for(int i=1;i<rows+1;i++){
				
				for(int j=1;j<count_a+1;j++){
					System.out.print(j); 
				}
				for(int k=count_b;k>0;k--){
					System.out.print(k);
				}
				System.out.println();
				count_a++;
				count_b++;
			}
		}		
				
		@Test(enabled=false)
		public void test12(){
			
			int rows=13;
			int count=7;
			int mid=(rows+1)/2;
			
			for(int i=1;i<rows+1;i++){
				for(int j=1;j<count+1;j++){
					System.out.print(j);
				}
				System.out.println();
				
				if(i<mid){
				count--;}
				else{
					count++;
				}
			}

		}		
		
		
		@Test(enabled=false)
		public void test13(){
			
			int rows=13;
			int count=7;
			int mid=(rows+1)/2;
			int space=0;
			int count_b=1;
			
			for(int i=1;i<rows+1;i++){
				
				for(int k=1;k<space+1;k++){
					System.out.print(" ");
				}
				
				for(int j=count_b;j<8;j++){
					System.out.print(j);
				}
				
				System.out.println();
	
				if(i<mid){
				count--;
				space++;
				count_b++;
				}
				else{
					count++;
					space--;
					count_b--;				
				}
				
			}
			
		}		
		
		
		@Test(enabled=false)
		public void test14(){
			int rows=7;
			int count=1;
			
			for(int i=1;i<rows+1;i++){
				for(int j=i;j>0;j--){
					System.out.print(j);
				}
				System.out.println();
				count++;
			}
		}	
	
		@Test(enabled=false)
		public void test15(){
			
			int rows=7;
			int count=1;
			int count_b=1;
			
			for(int i=1;i<rows+1;i++){
				for(int j=1;j<count+1;j++){
                   if(j%2!=0){
                	   System.out.print("1");
                   }
                   else{
                	   System.out.print("0");
                   
				}
 
			}
				System.out.println();
				count++;
			
		}	
		} 
	
		@Test(enabled=false)
		public void test16(){
			int rows=13;
			int count=7;
			int space=0;
			int count_b=1;
			int mid=(rows+1)/2;
			
			for(int i=1;i<rows+1;i++){
				for(int k=1;k<space+1;k++){
					System.out.print(" ");
				}
				for(int j=count_b;j<8;j++){
					System.out.print(j+" ");
				}
				System.out.println();
				if(i<mid){
				count=count-2;
				space++;
				count_b++;}
				else{
					count=count+2;
					space--;
					count_b--;
				}
				
			
			}
			
			}
			
		@Test(enabled=false)
		public void test17(){
			int rows=7;
			int count_a=6;
			int count_b=1	;
			
			for(int i=1;i<rows+1;i++){
				
				for(int j=1;j<count_a+1;j++)
				{
					System.out.print(1);
				}
				for(int k=1;k<count_b+1;k++){
					System.out.print(i);
				}
			System.out.println();
			count_a--;
			count_b++;
			
			}
		}			
		 
		@Test(enabled=false)
		public void test18(){
			int rows=7;
			int count=7;
			
			for(int i=1;i<rows+1;i++){
				for(int j=1;j<count+1;j++){
					if(i%2!=0){
						if(j%2!=0){
						System.out.print(1);}
						else{
						System.out.print(0);}
					}
					else{
						if(j%2==0){
							System.out.print(1);}
							else{
							System.out.print(0);}
					}
				}
				System.out.println();
			}
		}

		
		@Test(enabled=false)
		public void test19(){
			int rows=5;
			
			for(int i=1;i<=rows;i++){
				
				int lineitem=i;
				int addVar=4;
				
				for(int j=1;j<=i;j++){
					System.out.print(lineitem);
					System.out.print(" ");
					lineitem=lineitem+addVar;
					addVar--;
				}
				System.out.println();
			}			
			
			
	    }
		 		
		
		@Test(enabled=false)
		public void test20(){ 
			
			int rows=7;
			int count=7;
			
			for(int i=0;i<rows;i++){
				for(int j=0;j<count;j++){
					if(i==j){
						System.out.print(j);
					}
					else{
						System.out.print(0);
					}
				}
				System.out.println();
			}
			
		}		
		
		@Test(enabled=false)
		public void test21(){
			int rows=5;
			int count=1;
			int val=1;
			
			for(int i=1;i<rows+1;i++){
				for(int j=1;j<count+1;j++){
					System.out.print(val+" ");
					val++;
				}
				count++;
				System.out.println();
			}
		}		
		

		@Test(enabled=false)
		public void test22(){
			int rows=7;
			int count=1;
			
			for(int i=1;i<rows+1;i++){
				for(int j=1;j<count+1;j++){
					System.out.print(i);
				}
				System.out.println();
				count++;
			}
		}
		
		@Test(enabled=true)
		public void test23(){
			int rows=5;
			int count=1;
			
		}		
	
	
}
