public class HotelManagementSystem {

    public static void main(String[] args) {

        Room[] rooms = {
                new Room(101, "Single"),
                new Room(102, "Double"),
                new Room(103, "Suite")
        };

        Hotel hotel = new Hotel(rooms);

        hotel.displayRooms();


        Guest guest1 = new Guest("Alice", 30);
        Guest guest2 = new Guest("Bob", 35);

        hotel.bookRoom(rooms[0], guest1);
        hotel.bookRoom(rooms[2], guest2);

        hotel.displayRooms();
    }
}
    class Room {
        private int number;
        private String type; // Represented as a string
        private Guest guest;

        public Room(int number, String type) {
            this.number = number;
            this.type = type;
        }

        public int getNumber() {
            return number;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Guest getGuest() {
            return guest;
        }

        public void setGuest(Guest guest) {
            this.guest = guest;
        }

        public boolean isOccupied() {
            return guest != null;
        }
    }

    class Guest {
        private String name;
        private int age;

        public Guest(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    class Hotel {
        private Room[] rooms;

        public Hotel(Room[] rooms) {
            this.rooms = rooms;
        }

        public void displayRooms() {
            for (Room room : rooms) {
                System.out.println("Room Number: " + room.getNumber());
                System.out.println("Room Type: " + room.getType());
                if (room.isOccupied()) {
                    System.out.println("Guest Name: " + room.getGuest().getName());
                    System.out.println("Guest Age: " + room.getGuest().getAge());
                } else {
                    System.out.println("Room is vacant.");
                }
                System.out.println();
            }
        }

        public boolean bookRoom(Room room, Guest guest) {
            if (!room.isOccupied()) {
                room.setGuest(guest);
                return true;
            }
            return false;
        }
    }