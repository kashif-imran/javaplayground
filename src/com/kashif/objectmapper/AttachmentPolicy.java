package com.kashif.objectmapper;

import java.io.Serializable;

public class AttachmentPolicy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long maxFileSize;
	private long totalFileSize;
	private int maxFiles;
	private String[] fileTypes;
	
	public AttachmentPolicy() {
		
	}

	public long getMaxFileSize() {
		return maxFileSize;
	}

	public void setMaxFileSize(long maxFileSize) {
		this.maxFileSize = maxFileSize;
	}

	public long getTotalFileSize() {
		return totalFileSize;
	}

	public void setTotalFileSize(long totalFileSize) {
		this.totalFileSize = totalFileSize;
	}

	public int getMaxFiles() {
		return maxFiles;
	}

	public void setMaxFiles(int maxFiles) {
		this.maxFiles = maxFiles;
	}

	public String[] getFileTypes() {
		return fileTypes;
	}

	public void setFileTypes(String[] fileTypes) {
		this.fileTypes = fileTypes;
	}
}
