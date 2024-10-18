public class Student implements IListener {
    @Override
    public void listen(Sound sound) {
        write(sound.getSound());
    }

    private void write(String text) {
        System.out.println(text);
    }
}
