Marker Interface:- If an Interface doesn't contain any method and by implementing that interface, if our object 
will get some ability such type of interface are called Marker interface or ability Interface or Tag Interface. 

Eg. 1. Serializable(I)
    2. Cloneable(I) 
    3. Random Access(I)
    4. Single Thread Model(I)
          |
          |
          |
    

  These are marked for some ability. 


  Eg.1:- By implementing Serializable interface our objects can be saved to the file and can travel accross network.


  Eg.2:- By implementing cloneable interface our objects are in position to producee exectly duplicate cloned object.


Q. Without having any methods how the object will get some ability in marker interface? 
Ans:- Interface JVM is Responsible to provide required ability.


Q. Why JVM is providing required ability in Marker Interface?
Ans:- To reduce complexity of programming and to make java lang as simple.

Q. Is it possible create our own marker interface?
Ans:- Yes, but customization of JVM is required.

