package in.kpmg.WhatsappApiDemo.message.template;

import java.net.URI;
import java.util.List;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.MessageCreator;

public class MessageTemplate {
	
	 public static MessageCreator creator(final com.twilio.type.PhoneNumber to, 
             final com.twilio.type.PhoneNumber from, 
             final String body,final String templateid,final String msg) {
return new MessageCreator(to, from, body);
}


}
