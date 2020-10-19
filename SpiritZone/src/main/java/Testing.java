import java.text.SimpleDateFormat;
import java.io.*;
import java.nio.file.*;
import java.util.Date;
import java.util.Properties;
import java.util.zip.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.TestSpiritZone.TestLauncher;
import com.spiritzone.ConfigReader;
import com.spiritzone.PropertyConfigs;
import com.spiritzone.StorePassWord;
import com.spiritzone.ZipUtils;

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
	
		
String ConfigMailReport = ConfigReader.getInstance().getValue(PropertyConfigs.ConfigEmail);
		

		StorePassWord storedPassword;
		java.util.Date date=new java.util.Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		String folderDate=simpleDateFormat.format(date);
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("---------Starting Procedure to Send Mail------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
		String SOURCE_FOLDER = "C:\\Users\\Nishant\\git\\SpiritAndroid\\SpiritZone\\custom-reports\\EXCEL-REPORT\\28-Sep-2020.xlsx";
		//String SOURCE_FOLDER= ConfigReader.getInstance().getValue(PropertyConfigs.SOURCE_FOLDER_TO_ZIP);
		String OUTPUT_ZIP_FILE=ConfigReader.getInstance().getValue(PropertyConfigs.OUTPUT_ZIP_FILE);
		
		File file = new File(SOURCE_FOLDER);
		String zipFileName = OUTPUT_ZIP_FILE;
		
		FileOutputStream fos = new FileOutputStream(zipFileName);
        ZipOutputStream zos = new ZipOutputStream(fos);

        zos.putNextEntry(new ZipEntry(file.getName()));
        
        byte[] bytes = Files.readAllBytes(Paths.get(SOURCE_FOLDER));
        zos.write(bytes, 0, bytes.length);
        zos.closeEntry();
        zos.close();
		
//		ZipUtils appZip = new ZipUtils();
//        appZip.generateFileList(new File(SOURCE_FOLDER));
//        appZip.zipIt("");
		
		String MyEmailID = ConfigReader.getInstance().getValue(PropertyConfigs.MyEmailID);
		String MyName = ConfigReader.getInstance().getValue(PropertyConfigs.MyName);
		String ToEmail = ConfigReader.getInstance().getValue(PropertyConfigs.ToEmailID);
		
		
		storedPassword = new StorePassWord();
		Properties mailProp=System.getProperties();
		String mailHost=ConfigReader.getInstance().getValue(PropertyConfigs.mailHost);
		int mailPort=Integer.parseInt(ConfigReader.getInstance().getValue(PropertyConfigs.mailPort));
		mailProp.put("mail.smtp.auth", "true");
		mailProp.put("mail.smtp.starttls.enable", "true");
		//mailProp.put("mail.smtp.starttls.enable", "true");
		mailProp.put("mail.smtp.host", mailHost);
		mailProp.put("mail.smtp.port", mailPort);
		// outMail login Details
		final String outmailUsername = MyEmailID;
		final String outmailPassword = storedPassword.decrypt("AhYqFi8DFBQy6Jm5gI3upw==");
		//final String outmailPassword = "Kox44414";
		
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(outmailUsername, outmailPassword);
			}
		};

		Session session = Session.getInstance(mailProp, auth);

		try
		{
			MimeMessage msg = new MimeMessage(session);

			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
			msg.addHeader("Content-Transfer-Encoding", "8bit");
			msg.setSentDate(new Date());
			msg.setFrom(new InternetAddress(MyEmailID,MyEmailID));
			msg.setReplyTo(InternetAddress.parse(MyName, false));
			msg.setSubject("Result For Your Execution Is Here", "UTF-8");	
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(ToEmail, false));
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("Hello, Good day! \n"
					+ "\n"
					+ "All scenarios have been executed. Please find the attached report of the execution.  \n"
					+ "\n"
					+ "Thanks,\n"
					+ "Anmol.");
			Multipart multipart = new MimeMultipart();

			// Set text message part
			multipart.addBodyPart(messageBodyPart);
			// Second part is attachment
			messageBodyPart = new MimeBodyPart();
			
			//DataSource sourceZip = new FileDataSource(zip.toString());
			File file2 = new File(zipFileName);
			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(file2.getAbsolutePath());	
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(folderDate);
			multipart.addBodyPart(messageBodyPart);
			// Send the complete message parts
			msg.setContent(multipart);
			Transport.send(msg);  
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//zip.delete();
	}

}
