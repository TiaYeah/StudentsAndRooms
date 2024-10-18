public class Lector implements IListener{
    @Override
    public void listen(Sound sound) {

    }

    public void say (Room room, Sound sound) {
        room.echo(sound);
    }
}
