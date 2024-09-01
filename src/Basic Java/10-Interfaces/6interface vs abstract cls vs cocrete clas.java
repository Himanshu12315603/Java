interface v/s abstract class v/s concrete class 

1. If we don't know anything about implimentation just we have requirement specification then we should go for interface.

Eg. Servlet interface 

2. If we are taking about implimentation but not complietly (partial implimentation) then we should go for abstract class.

Eg. Generic Servlet (AC)
  Http Servlet (AC) 

3. If we are taking about implimentation complietly and ready to provide service then we should go for concrete class. 

Eg. MyOwnServlet 

Interface ------------> Servlet Interface ----------> plan
  |                             |                       |
  |                             |                       |
  |                             |                       |
Abstract class -------> Generic Servlet(AC) --------> Partially Comleted 
                        Http Servlet (AC)                building
  |                            |                            |
  |                            |                            |
  |                            |                            |
Concrete class -------> MyOwnServlet ----------------> Fully Completed Building

