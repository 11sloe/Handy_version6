import java.io.*;

public class Datei
{
    public void dateiLaden(String dateiname, Binaerbaum baum)
    {
        File datei = new File(dateiname);  
       
        try{
            BufferedReader reader = new BufferedReader(new FileReader(datei));
            
            String zeile = reader.readLine();
            
            while(zeile != null)
            {
                Vorschlag v = new Vorschlag(zeile);
                baum.einfuegen(v);
                zeile = reader.readLine();
            }
            
            reader.close();
        }catch(Exception ex)
        {
            System.out.println("Konnte die Datei nicht lesen");
            ex.printStackTrace();
        }
   
    }

}
