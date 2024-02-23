package com.te.contactmanagerthymleafproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

	private boolean error;
	private String msg;
	private Object object;
}
