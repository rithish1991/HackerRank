package com.lambdaPractices;
@FunctionalInterface
interface square
{
	
	int calculate(int x,int y);
}
  
class functionalInterface 
{ 
    public static void main(String args[]) 
    { 
    	square s;
    	s=(int x,int y)->x*y;
    	System.out.print(s.calculate(5,6));
    	
    	s=(int x,int y)->x*y;
    } 
}
