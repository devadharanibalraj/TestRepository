package org.looping;
public class Forloop2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){ //1, 1<=5, 
            //1+1, 2<=5, condition true		
//again loop starts
for(int j=1; j<=5; j++)	//1	 1<=5 condition true, then print j value ,  then increment in the loop
             // 1+1 , 2<=5 condition true, then print 2, 
             // 2+1 , 3<=3 condition true, then print 3
             // 3+1 , 4<=3 condition false, loop end 
              
{
System.out.print(j); //123
}
System.out.println();	//after the ending of J Loop , increment in the i loop,
}
}
}
