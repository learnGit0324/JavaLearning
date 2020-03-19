package com.adam.modler;

public class NewModel {
	private String column_A;
	private String column_B;
	
	public String getColumn_A() {
		return column_A;
	}
	public void setColumn_A(String column_A) {
		this.column_A = column_A;
	}
	public String getColumn_B() {
		return column_B;
	}
	public void setColumn_B(String column_B) {
		this.column_B = column_B;
	}
	@Override
	public String toString() {
		return "NewModel [column_A=" + column_A + ", column_B=" + column_B + "]";
	}
}
