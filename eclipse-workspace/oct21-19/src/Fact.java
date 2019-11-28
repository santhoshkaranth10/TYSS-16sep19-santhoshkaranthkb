class Fact{  
 public static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }  
 
 
 public static void main(String[] ar){      
  int result = factorial(5);   
  System.out.println("Factorial of a number is " +result);    
 }  
}  
