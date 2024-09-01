break:-

We can use break statement in the following places inside switch to
    stop fall throw.

  
1. Inside Switch:

      int x=0;
      switch(x)
      {
         case 0:
           System.out.println(0);
         case 1:
           System.out.println(1);
           break; 

        case 2:
           System.out.println(2);

        default:
           System.out.println("def");
      }

// O/p:- 0 1 




2. Inside loop: Break loop execution based on some condition.

Eg. for(int i=0; i<10; i++) 
      {
        if(i==5)
          break;
          System.out.println(i);      //0 1 2 3 4
      }



3. Inside Labled blocks:- To break block execution based on some condition.


Eg.   class Test
    {
      public static void main(String[] args) {

        int x=10;
        
        l1:
        {
          System.out.print("begin");

          if(x==10)
            break l1;
            
            System.out.print("end");
        }
        System.out.print(("Hello");
      }
    }

//    O/p:- begin end Hello


These are the only places where we can use break statement if you are using anywhere
else we will get Compile time Error Saying:- break outside switch or loop.


Eg. 
class Test 
{
  public static void main(String[] args) 
  {
    int x=10;

    if(x==10)
      break;
      System.out.print("Hello");
  }
}



// O/p:- break outside switch or loop 
