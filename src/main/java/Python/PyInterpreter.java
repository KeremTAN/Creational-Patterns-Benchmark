package Python;

import java.io.*;

public class PyInterpreter {
    public void execPy(String pyFile){
        try {
            String command = "python3 "+System.getProperty("user.dir")+"/src/main/resources/"+pyFile;;
            String osName = System.getProperty("os.name").toLowerCase();
            if(osName.contains("windows"))
                command = "cmd /c python "+System.getProperty("user.dir")+"\\src\\main\\resources\\"+pyFile;
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
            p.destroy();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
