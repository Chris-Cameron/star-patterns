/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  Christopher Cameron
 * @version January 26, 2018
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    
    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    
    public static void starZ(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if(i==0 || i==h-1 || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }       
    }
    
    
    public static void starXBox(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1 || i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    
    public static void twoStarBoxes(int h, int w)
    {  
        int hH = h/2;
        int wH = h/2;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                if((i<hH && j<wH)||(i>=hH && j>=wH))System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    
    public static void starTriangle(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i>=j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void emptyTriangle(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==j || i==h-1 || j==0) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }  
    
    
    public static void starTriangleUR(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if(j>=i)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    
    public static void isoscelesStarTriangle(int h)
    {
        int w = 2*h-1;
        
        for (int i=0; i<=h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (Math.abs(j-(w/2))<i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }    
    
    
    public static void checkerBoard(int h, int w)
    {
        biggerCheckerBoard(h, w, 1);
    }
    
    public static void biggerCheckerBoard(int h, int w, int scale)
    {
        int newH = scale*h;
        int newW = scale*w;
        for(int i=0; i<newH; i++)
        {
            for(int j=0; j<newW; j++)
            {
                if(((i/scale)+(j/scale))%2==0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void upsideDownCheckeredTriangle(int h)
    {
        int w = 2*h-1;
        
        for (int i=0; i<=h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if ((Math.abs(j-(w/2))<(h-i)) && ((i+j)%2 == 0)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }    
    
    
    public static void primeStars(int h)
    {
        for(int i=0; i<=h; i++)
        {
            int w = primeNum(i);
            
            for(int j=0; j<w; j++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
    
    private static int primeNum(int n)
    {
        int primeCount = 0;
        int testNum = 2;
        int currentPrime=0;
        
        while(primeCount<n)
        {
            if(isPrime(testNum))
            {
                primeCount++;
                currentPrime=testNum;
            }
            testNum++;
        }   
        
        return currentPrime;
    }
    
    private static boolean isPrime(int n)
    {
        if (n == 2) return true;
        else if (n % 2==0 || n < 2) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;  
    }
    
    
    public static void fibbonacciStars(int h)
    {
        int w = 1;
        int prevNum = 0;
        int prevPrevNum = 0;
        
        for(int i=0; i<h; i++)
        {
            if(i>0)
            {
                prevPrevNum = prevNum;
                prevNum = w;
                w = prevNum + prevPrevNum;
            }
            for(int j=0; j<w; j++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    public static void starFlag(int h, double w)
    {
        for(int i=0; i<h; i++)
        {
            for(int j=0; j<w; j++)
            {
                if((j<=w*(17.0/37.0)) && (i<(h/2)+1)) System.out.print("*");
                else if (i%2==0) System.out.print ("R");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
        
        starXBox(9);
        System.out.println();
        
        twoStarBoxes(12,12);
        System.out.println();
        
        starTriangle(6);
        System.out.println();
        
        emptyTriangle(6);
        System.out.println();
        
        starTriangleUR(10);
        System.out.println();
        
        isoscelesStarTriangle(5);
        System.out.println();
        
        checkerBoard(8, 8);
        System.out.println();
        
        biggerCheckerBoard(10, 8, 3);
        System.out.println();
        
        upsideDownCheckeredTriangle(6);
        System.out.println();
        
        primeStars(7);
        System.out.println();
        
        fibbonacciStars(8);
        System.out.println();
        
        starFlag(13, 37);
        System.out.println();
    }
     
}