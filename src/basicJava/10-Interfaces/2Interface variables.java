Interface variables:- 
An Interface can contain variables the main purpose of interface variable is to 
define requirment level constant.

Every interface variable is always public static final whether we are declaring or not. 

Eg. 
interface Interf 
{
  int x = 10;
}

--->public:- To make this variable available to every implimentation class. 

--->static:- without existing object also implimentation class has to access this variable. 

--->final:- It one implimentation class changes value then remaining implimentation class will 
            effected. To restrict this every interface variable is always final.  




Hence within the interface the following variable declaration are equal. 
int x = 10;
public int x = 10;
static int x = 10;
final int x = 10;
public static int x = 10;
public final int x = 10;
static final int x = 10;
public static final int x = 10;



As Every interface variable is always public static final we can't declare with the following modifiers. 

public --------> private,protected 
static -------->  transient 
final --------->  volatile 


For interface variable compulsory we should perform initilization at the time of declaration otherwise 
we will get CE. 

Eg. 
interface Interf 
{
  int x;            //CE:  = expected  
}

Inside Interface which of the following variable declaration are allowed. 

int x;          //wrong
private int x = 10;         //wrong
protected int x = 10;       //wrong
volatile int x = 10;        //wrong
transient int x = 10;       //wrong
public static int x = 10;   // right




@ Inside implimentation class we can access interface variable but we can't modify values. 

Eg. 
interface Interf 
{
  int x = 10; 
}

class Test implements Interf 
{
  public static void main(String[] args) 
  {
    x = 777;        --> // CE: Can't assign a value to final var x 
    System.out.println(x);
  }
}

class Test implements Interf 
{
  public static void main(String[] args) 
  {
    int x = 777; 
    System.out.println(x);          // 777
  }
}

