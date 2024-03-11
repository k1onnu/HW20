public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Flute flute = new Flute();

        Musician musician = new Musician();
        musician.perform(guitar);
        musician.perform(piano);
        musician.perform(flute);
    }
}