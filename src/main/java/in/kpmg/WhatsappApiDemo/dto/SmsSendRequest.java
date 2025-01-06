package in.kpmg.WhatsappApiDemo.dto;

import lombok.Data;

@Data
public class SmsSendRequest {

	private String mobileNo;
	private String msg;
}
