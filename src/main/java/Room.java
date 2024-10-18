import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<IListener> people;

    public Room() {
        people = new ArrayList<IListener>();
    }

    public void enterRoom(IListener person) {
        people.add(person);
    }

    public void echo(Sound sound) {
        for (IListener person : people) {
            person.listen(sound);
        }
    }
}
