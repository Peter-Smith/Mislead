import java.util.ArrayList;

public class Thinglist {
	// A thinglist is a list of things - the objects in an area, the objects in the inventory,
	// The list of directions, and so on. We use thinglist.find to match a word to an object
	// By iterating through relevant thinglists.

	ArrayList<Thing> contents = new ArrayList<Thing>();
	
	// Returns first object in thinglist with name equal to str. If it comes across an object
	// that isn't visible, it stops -and fails-. If item isn't found, also fails.
	public Thing find(String str){
		Thing result = null;
		for (int i=0;i<contents.size()&&!(result = contents.get(i)).match(str);i++){}
		if (!result.isVisible()){result = null;}
		return result;
	}
	
	public void add(Thing th){
		contents.add(th);
	}
	public void remove(Thing th){
		contents.remove(th);
	}
}
