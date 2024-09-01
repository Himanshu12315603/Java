Literal

Eg. int  x = 10;
  

Here:-
int is datatype/Keyword
x is Name of variable/identifier
10 is constant value/literal


A Constant value which can be assigned to the variable which called lateral.

Integral Literal:-

1. decimal literal(base-10):-(0 t0 9)
			      int x= 10;------decimal form
			      

2. Octal form (base-8):- (0 to 7)

			  int x = 010;  ------// Prefix with zero

3. Hexa decimal form (base-16):- (0 to 9 ,a to f)

				  int x = 0x10; ----// Prefix with 0x or 0x




class Test {
	public static void main(String[] args) {

		int x=10;
		int y=010;
		int z=0x10;

		System.out.println(x+"---"+y+"---"+z);  //output:- 10---8--16
	}
}


we can write like this:- 

int x=10;
long l=10l;
long l=10;
byte b= 10;
byte b=127;
short s=32767;
float f=123.456F;
double d= 123.456;
double d= 123.456d;
double d= 0123.456;
double d= 0xFace;
double d= 0786.0;
double d=10;
double d=0777;
double d= 1.2e3;
float f= 1.2e3F;
boolean b=true;
char ch='a';

char ch = 97;
char ch = 0xFace;
char ch = 0777;
char ch = 65535;









escape character:-
Every escape character is a valid char Literal.

Eg.
char ch = '\n';
char ch = '\t';


Escape Character----------description

\n ----------------------New line
\t ----------------------Horijontad Tab
\r ----------------------Carriage return
\b ----------------------Back space
\f ----------------------Form Feed
\' ----------------------Single quote
\" ----------------------Double quote
\\ ----------------------Back Slash





For integral datatype untill 1.6 version we can
specified literal value in the following ways:-
1). decimal
2). Octal
3). Hexadecimal form


But 1.7 version onword we can specified literal value even in Binary form also allow digits are 0,1.
// Prefix with 0b,0B

Eg:- int x = 0B1111;
     System.out.println(x); //15
			    




we can write like this :-

double d= 123456.789;


double d= 1_23_456.7_8_9;
double d= 123_456.7_8_9;

double d= 1__23_4_5__6.7_8_9;
double d= 1___2__3_4_5_6.7_8_9;



eg. float f= 10L;
System.out.println(f); //10.0
