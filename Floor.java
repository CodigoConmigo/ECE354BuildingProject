import java.util.ArrayList;

public class Floor {
	private int length;
	private int width;
	private int height;
	private int walls;
	private ArrayList roomDimensions = new ArrayList<>(3);
	
	public int setLength(int length)
	{
		this.length = length;
		roomDimensions.add(length);
		return length;
	}
	public int setWidth(int width)
	{
		this.width = width;
		roomDimensions.add(width);
		return width;
	}
	public int setHeight(int height)
	{
		this.height = height;
		roomDimensions.add(height);
		return height;
	}
	public int setWalls(int walls)
	{
		this.walls = walls;
		return walls;
	}
	public int getWalls()
	{
		return walls;
	}
	public ArrayList getDimensions()
	{
		return roomDimensions;
	}
	public void clearDimensions()
	{
		roomDimensions.clear();
	}

}
