package Python;

import java.io.*;

public class PyInterpreter {
    public void execPy(){
        try {
            String command = "cmd /c python "+System.getProperty("user.dir")+"\\src\\main\\resources\\Graph.py";
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line;
            while ((line = bri.readLine()) != null) {
                System.out.println(line);
            }
            bri.close();
            while ((line = bre.readLine()) != null) {
                System.out.println(line);
            }
            bre.close();
            p.waitFor();
            System.out.println("Done.");

            p.destroy();
        }
        catch (Exception e){}
    }
}
