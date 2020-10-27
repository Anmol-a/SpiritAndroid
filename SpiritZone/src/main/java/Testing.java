import java.text.SimpleDateFormat;
import java.io.*;
import java.nio.file.*;
import java.security.spec.KeySpec;
import java.util.Date;
import java.util.Properties;
import java.util.zip.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
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

import org.apache.commons.codec.binary.Base64;

import com.TestSpiritZone.TestLauncher;
import com.spiritzone.ConfigReader;
import com.spiritzone.PropertyConfigs;
import com.spiritzone.StorePassWord;
import com.spiritzone.ZipUtils;

public class Testing {
	StorePassWord storedPassword;
	
	
	public static void main(String[] args) throws Exception
	{
		
		String str = "whiskey";
		String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
		
		System.out.println(cap);
		
		
	}

}
