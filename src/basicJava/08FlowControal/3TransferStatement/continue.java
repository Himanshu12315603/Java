Continue:- We can use continue Statement inside loops to skip
    current iteration and continue for the next iteration.


Eg. for(int i=0; i<10; i++) {
        if(i%2==0) 
              continue;

        System.out.print(i);
}

// o/p:- 1 3 5 7 9



2. we can use continue statement only inside loops if we using anywhere else
    we will get CE Saying:- Continue outside of loop.


    public static void main(String[] args)
    {
      int x=10;
      if(x==10)
          continue;
    }







@labeled break & continue

we can use labeled break and continue to break or continue
a particular loop in nested loop.


Eg. 
        l1:
          for(------------)
          {
            -------
            l2:
              for(----------)
              {
                --------------
                  for(---------)
                  {
                      break l1;
                      break l2;
                      break;

                  }
              }
          }



l1:
for(int i=0; i<3; i++) 
{
  for(int j=0; j<3; j++) 
  {
    if(i==j)
      break;
    System.out.print(i+ "--" +j);
  }
}


break;              break l1;

1--0                 No o/p
2--0
2--1


continue l1         continue

1--0                 0--1
2--0                 0--2
2--1                 1--0
                     1--2
                     2--0
                     2--1









do-while()        v/s         continue

Eg.

int x=0;
do
{
  x++;
  System.out.println(x);

  if(++x<5)
    continue;

  x++;
  System.out.println(x);

}while(++x<10);


//O/p:-  1 4 6 8 10
