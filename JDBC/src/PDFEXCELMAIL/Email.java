package PDFEXCELMAIL;

/*
*https://www.google.com/settings/security/lesssecureapps
**/
import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;  
import javax.mail.internet.*;
public class Email {
  public static void main(String[] args)throws Exception {
	  try{
		  String host="smtp.gmail.com";
		  final String user="uvenkataramana047@gmail.com";
		  final String pass="8886030060";
		  String from="uvenkataramana047@gmail.com";
		  String to="uvenkatesh047@gmail.com";
		  String subject="this is venkataramana....";
		  String messageText="hi how r u venkat....";
		  boolean sessionDebug=false;
	  Properties prop=new Properties();
	  
	  prop.put("mail.smtp.starttls.enable","true");
	  prop.put("mail.smtp.host",host);
	  prop.put("mail.smtp.port","587");
	  prop.put("mail.smtp.auth","true");
	  prop.put("mail.smtp.starttls.required","true");
	  
	  //java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
	  Session session=Session.getDefaultInstance(prop,null);
	      session.setDebug(sessionDebug);
		  Message message=new MimeMessage(session);
		  message.setFrom(new InternetAddress(from));
		  InternetAddress[] address={new InternetAddress(to)};
		  message.setRecipients(Message.RecipientType.TO, address);
		  message.setSubject(subject);
		  message.setText(messageText);
		  message.setSentDate(new Date());
		  
		  
		  /*BodyPart mbp = new MimeBodyPart();
		  String filename = "file.txt";
		  DataSource src =  new FileDataSource(filename);
		  mbp.setDataHandler(new DataHandler(src));
		  */
		  
		  
		  Transport transport=session.getTransport("smtp");
		  transport.connect(host,user,pass);
		  transport.sendMessage(message, message.getAllRecipients());
		  transport.close();
		  System.out.println("\n ur message is delivered successfully.....");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}