package demo;

public class Number {
	 public static void main (String[] args)
	    {
	        int n[]=new int [5];
	        int max = 0;
	        int min = 0;
	        int i = 0;
	        for( i=0;i<5;i++)
	        { 
	          n[i]=(int)(Math.random()*100); 
	          System.out.print(n[i] +" ");
	          max=n[0];
	          min=n[0];
	         }
	        for( i=0;i<n.length;i++)
	        {
	            if(max<n[i])
	               max=n[i];
	            if(min>n[i])
	               min=n[i];
	         }
	    System.out.println("最大值"+max);
	    System.out.println("最小值"+min);
	    }
}
