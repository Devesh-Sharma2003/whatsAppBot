package in.kpmg.WhatsappApiDemo.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

import in.kpmg.WhatsappApiDemo.dto.SmsSendRequest;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SmsService {

	@Value("${TWILIO_ACCOUNT_SID}")
	String ACCOUNT_SID;
	
	@Value("${TWILIO_AUTH_TOKEN}")
	String AUTH_TOKEN;

	@Value("${TWILIO_OUTGOING_SMS_NUMBER}")
	String OUTGOING_SMS_NUMBER;
	
	@PostConstruct
	private void setup() {
		Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
	}
	
	
	public String sendSms(String phNo,String msg)
	{
//		Message mesg= Message.creator(
//				new PhoneNumber(phNo),
//				new PhoneNumber(OUTGOING_SMS_NUMBER),
//				msg).create(); 
//		
//		return mesg.getStatus().toString();
		
//		Message message = Message
//                .creator(new com.twilio.type.PhoneNumber("whatsapp:+919874316597"),
//                		new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
//                    "Hello, here is my horoscope!")
//                .setMediaUrl(Arrays.asList(URI.create("https://srv.clickastro.com/online-horoscope-results.php")))
//                .create();

		Message message = Message.creator(
			      new com.twilio.type.PhoneNumber("whatsapp:+919754251099"),
			      new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
//			      "HX350d429d32e64a552466cafecbe95f3c",
//			      "{\"1\":\"12/1\",\"2\":\"3pm\"}",
			      "Hello Aditi, here is your horoscope!\n \"https://srv.clickastro.com/online-horoscope-results.php\"")
//				.setMediaUrl(Arrays.asList(URI.create("https://srv.clickastro.com/online-horoscope-results.php")))
			    .create();
System.out.println(message.getUri());
return message.getBody();
				
	}
}
