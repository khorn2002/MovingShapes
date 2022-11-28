package finalProject;

public abstract class adapter extends GameObject{
	GameObject gObj;
	
	public adapter(GameObject gObj) 
	{
		super(gObj.getX(), gObj.getY());
	}
	
	public abstract void move(Canvas c);
}