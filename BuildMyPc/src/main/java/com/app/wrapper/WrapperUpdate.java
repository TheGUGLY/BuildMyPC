package com.app.wrapper;

public class WrapperUpdate {
	private String updateName;
	private String updatebrand;
	private String updatecategory;
	private String updatedescription;
	private String updatemodelNumber;
	private int updateprice;
	private int updatequantity;
	public String getUpdateName() {
		return updateName;
	}
	public String getUpdatebrand() {
		return updatebrand;
	}
	public String getUpdatecategory() {
		return updatecategory;
	}
	public String getUpdatedescription() {
		return updatedescription;
	}
	public String getUpdatemodelNumber() {
		return updatemodelNumber;
	}
	public int getUpdateprice() {
		return updateprice;
	}
	public int getUpdatequantity() {
		return updatequantity;
	}
	@Override
	public String toString() {
		return "WrapperUpdate [updateName=" + updateName + ", updatebrand=" + updatebrand + ", updatecategory="
				+ updatecategory + ", updatedescription=" + updatedescription + ", updatemodelNumber="
				+ updatemodelNumber + ", updateprice=" + updateprice + ", updatequantity=" + updatequantity + "]";
	}
	
	
}
