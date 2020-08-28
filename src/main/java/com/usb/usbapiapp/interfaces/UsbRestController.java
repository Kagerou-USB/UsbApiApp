package com.usb.usbapiapp.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsbRestController {
	
	@RequestMapping
	public String index() {
		return "test";
	}
}
