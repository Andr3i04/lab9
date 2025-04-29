public interface ExportToFile {
    private static void writeToFile(ArrayList<Persoane> persoane) {
        String filename = "persoane.txt";
        try(PrintWriter pw=new PrintWriter(filename)){
            for(Persoane p:persoane){
                pw.println(p.toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
