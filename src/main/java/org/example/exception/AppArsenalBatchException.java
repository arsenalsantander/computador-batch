package org.example.exception;

import lombok.NoArgsConstructor;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
public class AppComputadorBatchException extends RuntimeException implements ExitCodeGenerator {

	private static final long serialVersionUID = -8330713163893934146L;
	private int code;

	public AppComputadorBatchException(int code, String message) {
		super(message);
		this.code = code;
	}

	public AppComputadorBatchException(int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	@Override
	public int getExitCode() {
		return code;
	}

}