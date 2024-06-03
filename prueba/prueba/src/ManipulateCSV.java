import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class ManipularCSV {
    private BufferedReader lector;
    private  String linea;
    private String partes[] = null;

    public void leerArchive(String sombreArchive){
        try{
            lector = new BufferedReader(new FileReader(sombreArchive));
            while ((linea = lector.readLine()) !=null){
                partes = linea.split(",");
                imprimirLinea();
            }
            lector.close();
            linea = null;
            partes = null;
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null,e);
        }
    }
    public void imprimirLinea(){
        for (int i = 0 ; i <partes.length; i++){
            Comanda comanda1 = new Comanda(partes[0]);
            System.out.println(comanda1.getClients());
        }
    }
}
