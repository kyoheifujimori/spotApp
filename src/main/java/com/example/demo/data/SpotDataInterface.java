package com.example.demo.data;

public interface SpotDataInterface {

	//	idの設定
	public int getSpotId();

	public void setSpotId(int spotid);

	//	SpotNameの設定
	public String getSpotName();

	public void setSpotName(String spotname);

	//	SpotAddressの設定
	public String getSpotAddress();

	public void setSpotAddress(String spotaddress);

	//	SpotExplanationの設定
	public String getSpotExplanation();

	public void setSpotExplanation(String spotexplanation);

	//	SpotPictureの設定
	public String getSpotPicture();

	public void setSpotPicture(String spotpicture);
}
