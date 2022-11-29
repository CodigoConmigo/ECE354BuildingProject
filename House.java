import java.util.ArrayList;

public class House {
	Floor floor;
	public ArrayList<Floor> listOfFloors;
	
	public House()
	{
		floor = new Floor();
		listOfFloors = new ArrayList<Floor>();
	}
	public ArrayList<Floor> getFloors()
	{
		return listOfFloors;
	}

}
