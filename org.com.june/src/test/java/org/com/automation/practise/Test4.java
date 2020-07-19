package org.com.automation.practise;

import org.testng.annotations.Test;

public class Test4 {
	
	@Test(enabled=false)
	public void test1(){
		
		int star=1;
		int hash=4;
		int rows=3;
		
		for(int i=1;i<=rows;i++){
			
			if(i%2!=0){
				for(int j=1;j<=star;j++){
					System.out.print("*");
				}
				for(int k=1;k<=hash;k++){
					System.out.print("#");
				}
			}
			else{
				for(int k=1;k<=hash;k++){
					System.out.print("#");
				}
				for(int j=1;j<=star;j++){
					System.out.print("*");
				}
			}
			System.out.println();
			star++;
			hash--;
			
		}
		
	}
	
	@Test(enabled=false)
	public void test2(){
		
		int rows=5;
		int star=5;
		int space=0;
		int mid=(rows+1)/2;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			
			System.out.println();
			if(i<mid){
				star=star-2;
				space++;
			}
			else{
				star=star+2;
				space--;				
			}
		}
		
	}
	
	@Test(enabled=false)
	public void test3(){
		
		int star=1;
		int rows=5;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=star;j++){
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
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println(); 
		}

	}	
	
	@Test(enabled=false)
	public void test5(){
		
		int rows=13;
		int count=1;
		int mid=(rows+1)/2;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=count;j++){
				System.out.print(j);
			}
			System.out.println();
			if(i<mid){
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
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(count);
			}
			System.out.println();
			count++;
		}
		
	}	

	@Test(enabled=false)
	public void test7(){
		
		int rows=7;
		int count=1;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=7;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	@Test(enabled=false)
	public void test8(){
		
		int rows =7;
		int count=7;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=count;j++){
				
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
		
		for(int i=1;i<=rows;i++){
			for(int j=count;j>=1;j--){
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
	
		for(int i=1;i<=rows;i++){
			int lineItem=7;
			for(int j=1;j<=count;j++){
				
				System.out.print(lineItem);
				lineItem--;
			}
			System.out.println();
			count++;
		}
		
	}	

	@Test(enabled=false)
	public void test11(){
		
		int rows=7;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--){
				System.out.print(k);
			}
			System.out.println();
			
		}
		
	}
	
	@Test(enabled=false)
	public void test12(){
		
		int rows=13;
		int count=7;
		int mid=(rows+1)/2;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=count;j++){
				System.out.print(j);
			}
			System.out.println();
			if(i<mid){
				count--;
			}
			else{
				count++;
			}
		}
	
	}
	
	@Test(enabled=false)
	public void test13(){
		
		int rows=13;
		int count=1;
		int space=0;
	    int mid=(rows+1)/2;
		
		for(int i=1;i<=rows;i++){
			
			for(int k=0;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=count;j<=7;j++){
				System.out.print(j);
			}
			System.out.println();
			
			if(i<mid){
				space++;
				count++;
			}
			else{
				space--;
				count--;
			}
		}
		
		
	}
	
	@Test(enabled=false)
	public void test14(){
		
		int rows=7;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
			
		}
	}	
	
	@Test(enabled=false)
	public void test15(){
		
		int rows=7;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print("1");
				}
				else if(j%2==0){
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}	
	
	@Test(enabled=false)
	public void test16(){
		
		int rows=13;
		int space=0;
		int count=1;
		int mid=(rows+1)/2;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=0;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=count;k<=7;k++){
				System.out.print(k);
				System.out.print(" ");
			}
			System.out.println();
			if(i<mid){
				space++;
				count++;
			}
			else{
				space--;
				count--;
			}
			
		}
			
	}
	
	@Test(enabled=false)
	public void test17(){ 
		
		int rows=7;
		int one=6;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=one;j++){
				System.out.print("1");
			}
			for(int k=1;k<=i;k++){
				System.out.print(i);
			}
			System.out.println();
			one--;
		}
		
	}
	
	@Test(enabled=false)
	public void test18(){
		
        int rows=7; 
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=rows;j++){
				
				if(i%2!=0){
					if(j%2!=0){
						System.out.print("1");
					}
					else if(j%2==0){
						System.out.print("0");
					}
				}
				else{
					
					if(j%2==0){
						System.out.print("1");
					}
					else if(j%2!=0){
						System.out.print("0");
					}
					
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
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
	}
	
	@Test(enabled=false)
	public void test21(){
		
		int rows=5;
		int count=1;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(count);
				System.out.print(" ");
				count++;
			}
			System.out.println();
		}
		
	}	

	@Test(enabled=false)
	public void test22(){
	
		int rows=7;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	
	}
	
	
	@Test(enabled=true)
	public void test23(){
		
	}	
	
	
	
	
}