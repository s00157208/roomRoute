package ie.itsligo.roomroute;

public class Room {
	private String room;
	private String expr = null;
	public int i = 0;
	public Room() {
		
	}
	
	public String get(String data)
	{
		room = "E2004";
		// TODO extract the room number eg E2004 from the data passed in
		// Here you write the code to parse the data string and extract
		// the room
		String expr = room;
		String delims = "[E]+";
		//String expr = null;
		String[] tokens = expr.split(delims);
		
				for (int i = 0; i < tokens.length; i++) //print characters passed though expr.split method
					
					System.out.println(tokens[i]);
					
		
		
		return(room);
	}

}
