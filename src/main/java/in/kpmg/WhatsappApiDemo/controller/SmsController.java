package in.kpmg.WhatsappApiDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.kpmg.WhatsappApiDemo.dto.SmsSendRequest;
import in.kpmg.WhatsappApiDemo.service.SmsService;

@RestController
public class SmsController {

	@Autowired
	SmsService smsService;
	
	@PostMapping("/send-sms")
	public ResponseEntity<?> processSms(@RequestBody SmsSendRequest smsBody) {
        return new ResponseEntity<>(smsService.sendSms(smsBody.getMobileNo(),smsBody.getMsg()), HttpStatus.OK);
    }
}
