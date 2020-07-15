public class Room {
    //3. make a check condition in the while loop
    //if the key in the current room is not null, than user pick up
    // the key into his arraylist of the keyarr. (using the add method)
    private String name;
    private String description;
    private Room[] nearbyRooms;
    private boolean isExit;
    private boolean isLocked;
    private String keyToRoom = "bathRoom";

    public Room(String name, String description, boolean isExit, boolean isLocked, String keyToRoom){
        nearbyRooms = new Room[4];
        this.name = name;
        this.description = description;
        this.isExit = isExit;
        this.isLocked = isLocked;
        this.keyToRoom = keyToRoom;
    }
    // get if room is lock
    public boolean getIsLocked() { return isLocked; }
    public void setIsLocked(boolean isLocked) { this.isLocked = isLocked; }
    // gets the name of the room
    public String getName(){
        return name;
    }

    // sets the name of the room
    public void setName(String name){
        this.name = name;
    }

    // gets the description of the room
    public String getDescription() {
        return description;
    }

    // sets the description of the room
    public void setDescription(String description) {
        this.description = description;
    }

    // sets the room to the specified index in the array
    public void setNearbyRooms(int index, Room room){
        this.nearbyRooms[index] = room;
    }

    // gets the room at the specified index
    public Room getRoom(int index){
        return this.nearbyRooms[index];
    }

    public void printAvailableRooms(){
        for(int i = 0; i<this.nearbyRooms.length; i++){
            if(this.nearbyRooms[i]!=null){
                //if(keyToRoom != "bathRoom"){
                //    System.out.println("Find the key.");
                //}
                if(i == 0){
                    System.out.println("You can go north to the "+this.nearbyRooms[i].getName());
                }
                else if(i == 1){
                    System.out.println("You can go east to the "+this.nearbyRooms[i].getName());
                }
                else if(i == 2){
                    System.out.println("You can go south to the "+this.nearbyRooms[i].getName());
                }
                else {
                    System.out.println("You can go west to the "+this.nearbyRooms[i].getName());
                }
            }
        }
    }
}
