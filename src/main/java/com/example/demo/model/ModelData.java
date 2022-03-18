package com.example.demo.model;

import java.io.Serializable;

public class ModelData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4675086740446209824L;
	private int code;
	private String mensaje;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	private boolean status;

}
