import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Persoane> persoane = listaPersoane();
       // writeToConsole(persoane);
       // writeToFile(persoane);


        export(persoane,new ExportToFile("persoane.txt"));
        export(persoane,
                ArrayList<Persoane>listaPersoane()->
            System.out.println("Sent by email" + listaPersoane())
        );
    }

    private static void export(ArrayList<Persoane> persoane,Exporter exporter) {
        exporter.export(persoane);
    }

  /*  private static void writeToFile(ArrayList<Persoane> persoane) {
        String filename = "persoane.txt";
        try(PrintWriter pw=new PrintWriter(filename)){
            for(Persoane p:persoane){
                pw.println(p.toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
*/
    /*
    private static void writeToConsole(ArrayList<Persoane> persoane) {

        for (Persoane p : persoane) {
            System.out.println(p);
        }
    }
*/
    public static ArrayList<Persoane> listaPersoane() {
        ArrayList<Persoane> persoane = new ArrayList<>();

        persoane.add(new Persoane("Moldovan", "Andrei"));
        persoane.add(new Persoane("Blaga", "Rares"));
        persoane.add(new Persoane("Dita", "Vlad"));
        persoane.add(new Persoane("Panfiloiu", "Luigi"));

        return persoane;
    }
}
