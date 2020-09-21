import java.text.SimpleDateFormat;
import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

import com.TestSpiritZone.TestLauncher;
import com.spiritzone.ConfigReader;
import com.spiritzone.PropertyConfigs;

public class Testing {

	
/*	private static void zipFiles(String... filePaths) {
        try {
        	
            File firstFile = new File(filePaths[0]);
            String zipFileName = firstFile.getName().concat(".zip");
 
            FileOutputStream fos = new FileOutputStream(zipFileName);
            ZipOutputStream zos = new ZipOutputStream(fos);
 
            for (String aFile : filePaths) {
                zos.putNextEntry(new ZipEntry(new File(aFile).getName()));
 
                byte[] bytes = Files.readAllBytes(Paths.get(aFile));
                zos.write(bytes, 0, bytes.length);
                zos.closeEntry();
            }
 
            zos.close();
 
        } catch (FileNotFoundException ex) {
            System.err.println("A file does not exist: " + ex);
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        }
    }
*/
		
	
	public static void main(String[] args) throws Exception
	{
	
		
		System.out.println(System.getProperty("user.dir")+"\\config.properties");
	}

}
