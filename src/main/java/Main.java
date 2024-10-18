public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Lector lec = new Lector();
        Room room = new Room();

        room.enterRoom(s1);
        room.enterRoom(s2);
        room.enterRoom(s3);
        //room.enterRoom(lec);

        lec.say(room, new Sound("mew"));
    }
}
