Syntax for Seter method:-

1. it should be public method.
2. The return type should be void.
3. Method name should be prefixed with set.
4. It should take some argument that it should not be no argument method.

	

	public void setName(String name) {
		
	}




Syntax for getter method:-

1. It should be public method.
2. The return type should not be void.
3. Method name should prefix with get. 
	it should not take any argument.

		
	public String getName() {

	}


Note:- For boolean property getter method name can be prefixed with 
	either get or is, but recommanded to use is.

	private boolean empty;
	public boolean getEmpty()
	{
	return empty;
	}

	public boolean isEmpty() 
	{
	return empty;
	}

________________________________________________________________________

Coding standard for Listeners:-

case1:- To register a listeners method name should be prefixed with add.

	public void addMyActionListener(addMyActionListeners)       // right

	public void registerMyActionListener(MyActionListener l)    //wrong

	public void addMyActionListener(Action Listner l) 	    //wrong



case2:- To unregister a Listner Method name should be prefixed with removed.


	public void removeMyActionListner(My ActionListener l)     //right


	public void unRegisterMyActionListener(MyActionListener l) //wrong


	public void removeMyActionListener(ActionListener l) 	 //wrong


	public void deleteActionListener(My Action Listener l)   //wrong















