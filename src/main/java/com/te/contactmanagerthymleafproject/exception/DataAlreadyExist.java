package com.te.contactmanagerthymleafproject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@SuppressWarnings("serial")
@Getter
@AllArgsConstructor
public class DataAlreadyExist extends RuntimeException {

	private final String message;
}
