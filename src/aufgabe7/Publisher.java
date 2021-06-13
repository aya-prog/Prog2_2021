package aufgaben.aufgabe7;

public Interface Publisher {
	
	public boolean register(Listener listener);
	public boolean unregister(Listener listener);
	public void notifyListeners();
	public String getUpdate(Listener listener);


}
