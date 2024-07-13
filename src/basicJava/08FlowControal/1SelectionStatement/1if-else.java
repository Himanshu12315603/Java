1.if-else

Syntax:- 
	if(b) ------------------> should be boolean type
 	{
		Action if b is true
	}
	else
	{
		Action if b is false
	}


The Argument to the if-statement should be boolean type by mistake if you are trying 
to provide any other type then we will get Compile timeError.


int x = 0;					int x = 10;
if(x) {						if(x=20) {
	Sopln("Hello");					Sopln("Hello");
}else {							}else {
	Sopln("Hi");					Sopln("Hi");
}							}



			In both case:- CE: incompatible types
					found: int
					required: boolean






int x = 10;				boolean b = true;			boolean b=false;
if(x==20) {				if(b=false)				if(b==false)
	Sopln("Hello");			{					{
}						Sopln("Hello");				Sopln("Hello");
else {					} else {				}else {
	Sopln("Hi");				Sopln("Hi");				Sopln("Hi");
}					}					}

o/p:- Hi				o/p:- Hi				o/p:- Hello


else part and curly braces
