    # Zuul starter

## Get setup
Clone this file into your local computer by either 
clicking the button or run a command like
`git clone https://github.com/ThomasLiARDJAVA/Zuul-starter.git`
in your terminal. 

You are provided with starter code, try to read and
understand the starter code. I have commented the
meaning and use of the varaibles, so it shouldn't be too
hard to understand

In this assignment, you are ask to complete
an unfinished game of zuul

## Get started
### 1. figure out what kind of rooms you want to make
On a piece of paper draw out your map that you want to design you game.
At least 4 rooms, one exit, one starting point.

### 2. make a isLocked attribute in the Room class
This attribute will be boolean, and this is the attribute that
determines if the room is locked or not. You also will need 
a key object to unlock this room. String called keyToRoom, this
string will be the key to the room name ex: if keyToRoom="center"
this key opens the center room. 

### 3. make a check condition in the while loop
if the key in the current room is not null, than user picks up the 
key into his arraylist of the keyarr. (using the add method)

### 4. make a check condition to see if user can go through a locked room
once you reach a locked room, you want to check if the key 
to that locked room is currently in your keyarr. if it is, than
we can let user go through, otherwise print to user that they need
to find the key somewhere. (contains() this method helps you to check
if the parameter exists in the arrayList).
## Grade 100 pts
