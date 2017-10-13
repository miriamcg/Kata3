package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("correo.ulpgc.es");
        histogram.increment("correo.ulpgc.es");
        histogram.increment("correo.ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("yahoo.es");
        new HistogramDisplay(histogram).execute();
    }
}
