import java.util.Scanner;
import java.util.ArrayList;
public class    GameDriver {
    public static void main(String[] args){
        int amountMoves = 0;

        Scanner scan = new Scanner(System.in);
        ArrayList<String> keyarr = new ArrayList(); // used to store keys that user picks up.
        Room centerRoom = new Room("center", "This is the center room", false, false, "centeRoom");
        Room exit = new Room("exit", "this is the exit", true, true, "exit");
        Room bedRoom = new Room("bedRoom", "This is the bedroom room", false, false, "bedRoom");
        Room kitchen = new Room("kitchen", "This is the kitchen room", false,false, "kitchen");
        Room bathRoom = new Room("bathRoom", "This is the bathroom room", false, false, "bathroom");
        Room entrance = new Room("entrance", "This is the entrance room", false, false, "entrance");
        Room currentRoom = entrance;
        centerRoom.setNearbyRooms(0, bedRoom);
        centerRoom.setNearbyRooms(3, kitchen);
        bedRoom.setNearbyRooms(2, centerRoom);
        kitchen.setNearbyRooms(1, centerRoom);
        bedRoom.setNearbyRooms(1, bathRoom);
        bathRoom.setNearbyRooms(3, bedRoom);
        kitchen.setNearbyRooms(3, exit);
        exit.setNearbyRooms(1, kitchen);
        exit.setNearbyRooms(1, kitchen);
        centerRoom.setNearbyRooms(2, entrance);
        entrance.setNearbyRooms(0, centerRoom);
        while(!currentRoom.equals(exit)&&amountMoves<=10) {
            System.out.println("You are currently in the "+currentRoom.getName());
            currentRoom.printAvailableRooms();
            System.out.println("Please enter your next move: 0: north, 1: east, 2: south, 3: west");
            // TODO print all the keys in the current room, null
            if (currentRoom.getName() == "bathRoom") {
                exit.setIsLocked(false);
                System.out.println("You found a key!");
                keyarr.add("key");
            }
            if (currentRoom.getName() == "exit"){
                if (keyarr.contains("key")){

                } else {

                    System.out.println("You can't go to the exit till you find the key");
                }
            }
            int userMove = scan.nextInt();
            if(currentRoom.getRoom(userMove).getIsLocked() == true){
                System.out.println("you cannot move in this direction");
            }else {
                currentRoom = currentRoom.getRoom(userMove);
                amountMoves++;
            }
        }
        if(amountMoves>10||!currentRoom.equals(exit)){
            System.out.println("You lost");
        }else{
            System.out.println("You win");
        }


      }
}
