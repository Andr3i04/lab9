public class Persoane {
    String nume;
    String prenume;

    public Persoane(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    @Override
    public String toString() {
        return nume + " " + prenume;
    }
}
