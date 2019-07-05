package com.git;

public class Sb {

	private int sbid;
	private String sbName;
	public Sb() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sb(int sbid, String sbName) {
		super();
		this.sbid = sbid;
		this.sbName = sbName;
	}
	public int getSbid() {
		return sbid;
	}
	public void setSbid(int sbid) {
		this.sbid = sbid;
	}
	public String getSbName() {
		return sbName;
	}
	public void setSbName(String sbName) {
		this.sbName = sbName;
	}
	@Override
	public String toString() {
		return "Sb [sbid=" + sbid + ", sbName=" + sbName + "]";
	}
	
	
}
