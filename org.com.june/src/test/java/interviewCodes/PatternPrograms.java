package interviewCodes;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PatternPrograms extends InterviewCodes {

//	*####
//	###**
//	***##
//	@Test
	@Test
	public void test1() throws ArithmeticException{
		int rows = 3;
		int star = 1;
		int hash = 4;
		
		for(int i=1;i<=rows;i++) {
			if(i%2!=0) {
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=hash;k++) {
					System.out.print("#");
				}	
			}else {
				for(int k=1;k<=hash;k++) {
					System.out.print("#");
				}
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
			}
			star++;
			hash--;
			System.out.println();
		}
		
	}
	
	
//	*****
//	 ***
//	  *
//	 ***
//	*****
//	@Test
	@Test
	public void test2() {
		int rows =5;
		int star = 5;
		int space = 0;
		int mid = (rows+1)/2;
		
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<mid) {
				star = star-2;
				space++;
			} 
			else  {
				star = star+2;
				space--;
			} 			
			System.out.println();
		}
		
	}

	
//	*
//	***
//	*****
//	*******
//	*********
//	@Test
	@Test
	public void test3() {
		int rows =5;
		int star = 1;
		
		for(int i=1;i<=rows;i++) {
		  	for(int j=1;j<=star;j++) {
		  		System.out.print("*");
		  	}
		  	star = star+2;
		  	System.out.println();
		}
	}
	

//	1
//	12
//	123
//	1234
//	12345
//	123456
//	1234567
//	@Test
	@Test
	public void test4() {
		int rows =7;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	1
//	12
//	123
//	1234
//	12345
//	123456
//	1234567
//	123456
//	12345
//	1234
//	123
//	12
//	1
//	@Test
	@Test
	public void test5() {
		int rows =13;
		int count = 1;
		
		int mid = (rows+1)/2;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=count;j++) {
				System.out.print(j);
			}
			
			if(i<mid)
				count++;
			else
				count--;
			System.out.println();
		}
	}
	

//	1
//	22
//	333
//	4444
//	55555
//	666666
//	7777777
//	@Test
	@Test
	public void test6() {
		int rows =7;
		int count = 1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=count;j++) {
				System.out.print(count);
			}
			System.out.println();
			count++;
		}			
	}
	
//	7654321
//	765432
//	76543
//	7654
//	765
//	76
//	7
//	@Test
	@Test
	public void test7() {
		int rows =7;
		
		for(int i=1;i<=rows;i++) {
			for(int j=7;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
			
	}
	
//	1234567
//	123456
//	12345
//	1234
//	123
//	12
//	1
//	@Test
	@Test
	public void test8() {
		int rows =7;
		int count = 7;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=count;j++) {
				System.out.print(j);
			}
			count--;
			System.out.println();
		}
			
	}

	
//	7
//	76
//	765
//	7654
//	76543
//	765432
//	7654321
//	1234567
//	123456
//	12345
//	1234
//	123
//	12
//	1
//	@Test
	@Test
	public void test9() {
		int rows =13;
		int count = 7;
		int mid = (rows+1)/2;		
		
		for(int i=1;i<=rows;i++) {
			for(int j=7;j>=count;j--) {
				System.out.print(j);
			}
			if(i<mid)
				count--;
			else
				count++;
			System.out.println();
		}
	}
	
//	1
//	121
//	12321
//	1234321
//	123454321
//	12345654321
//	1234567654321
//	@Test
	@Test
	public void test10() {
		int rows =7;
		int count_a = 1;
		int count_b = 0;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=count_a;j++) {
				System.out.print(j);
			}
			for(int k=count_b;k>0;k--) {
				System.out.print(k);
			}
			System.out.println();
			count_a++;
			count_b++;
		}
	}
	
	
//	1234567
//	123456
//	12345
//	1234
//	123
//	12
//	1
//	12
//	123
//	1234
//	12345
//	123456
//	1234567
//	@Test
	@Test
	public void test11() {
		int rows = 13;
		int mid = (rows+1)/2;
		int count = 7;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=count;j++) {
				System.out.print(j);
			}
			System.out.println();
			if(i<mid)
				count--;
			else
				count++;
		}

	}
	
//	1234567
//	 234567
//	  34567
//	   4567
//	    567
//	     67
//	      7
//	     67
//	    567
//	   4567
//	  34567
//	 234567
//	1234567
//	@Test
	@Test
	public void test12() {
		int rows = 13;
		int space = 0;
		int mid = (rows+1)/2;
		int count = 1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=count;k<=7;k++) {
				System.out.print(k);
			}
			System.out.println();
			if(i<mid) {
				count++;
				space++;				
			}else {
				count--;
				space--;				
			}

		}

	}
	
	
//	1
//	21
//	321
//	4321
//	54321
//	654321
//	7654321
//	@Test
	@Test
	public void test13() {
		int rows = 7;
		
		for(int i=1;i<=rows;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}	
	
//	1
//	10
//	101
//	1010
//	10101
//	101010
//	1010101
//	@Test
	@Test
	public void test14() {
		int rows = 7;
		int count = 1;
		
		for(int i=1;i<=rows;i++) {
		   for(int j=1;j<=count;j++) {
			   if(j%2!=0) 
				   System.out.print(1);
			   else
				   System.out.print(0);
		   }
		   System.out.println();
		   count++;
		}

	}
	

//	1 2 3 4 5 6 7 
//	 2 3 4 5 6 7 
//	  3 4 5 6 7 
//	   4 5 6 7 
//	    5 6 7 
//	     6 7 
//	      7 
//	     6 7 
//	    5 6 7 
//	   4 5 6 7 
//	  3 4 5 6 7 
//	 2 3 4 5 6 7 
//	1 2 3 4 5 6 7 
//	@Test
	@Test
	public void test15() {
		int rows = 13;
		int count = 1;
		int space = 0;
		int mid = (rows+1)/2;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=count;k<=7;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
			if(i<mid) {
				space++;
				count++;
			}else {
				space--;
				count--;				
			}
			
		}

	}

	
//	1111111
//	1111122
//	1111333
//	1114444
//	1155555
//	1666666
//	7777777 
//	@Test
	@Test
	public void test16() {
		int rows = 7;
		int count_a = 6;
		int count_b = 1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=count_a;j++) {
				System.out.print(1);
			}
			for(int k=1;k<=count_b;k++) {
				System.out.print(count_b);
			}
			System.out.println();
			count_a--;
			count_b++;
		}
		
	}
	

//	1010101
//	0101010
//	1010101
//	0101010
//	1010101
//	0101010
//	1010101
//	@Test
	@Test
	public void test17() {
		int rows = 7;
		int count = 7; 
		
		for(int i=1;i<=rows;i++) {
			if(i%2==0) {
				for(int j=1;j<=count;j++) {
					if(j%2==0) {
						System.out.print(1);
					}else
						System.out.print(0);
				}
			}else {
				for(int j=1;j<=count;j++) {
					if(j%2==0) {
						System.out.print(0);
					}else
						System.out.print(1);
				}
			}
			System.out.println();
		}
		
	}
	
	
//	1 
//	2 6 
//	3 7 10 
//	4 8 11 13 
//	5 9 12 14 15 
//	@Test
	@Test
	public void test18() {
		int rows = 5;
		int count = 1;

		for(int i=1;i<=rows;i++) {
			int num = count;
			int var = 4;
			
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num = num+var;
				var--;
			}
			System.out.println();
			count++;
		}		
	}
	
//	0000000
//	0100000
//	0020000
//	0003000
//	0000400
//	0000050
//	0000006
//	@Test
	@Test
	public void test19() {
		int rows = 7;
		int count = 7;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<count;j++) {
				if(j==i)
					System.out.print(j);
				else
					System.out.print(0);
			}
			System.out.println();
		}

	}	
	

//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
//	@Test
	@Test
	public void test20() {
		int rows = 5;
		int count = 1;
		int val = 1;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=count;j++) {
				System.out.print(val);
				System.out.print(" ");
				val++;
				
			}
			System.out.println();
			count++;
		}
		
	}	
	

//	1
//	22
//	333
//	4444
//	55555
//	666666
//	7777777
//	@Test
	@Test
	public void test21() {
		int rows = 7;
		int count = 1;
		int val = 1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}


	@Test
	@Override
	public void test101() {
		// TODO Auto-generated method stub
		InterviewCodes interviewCodes = new PatternPrograms();
	}


	@Override
	public void test103() {
		// TODO Auto-generated method stub
		
	}	
	
	
	
	
	
	
	
	
	
	
}
