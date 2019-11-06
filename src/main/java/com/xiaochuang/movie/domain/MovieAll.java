package com.xiaochuang.movie.domain;

public class MovieAll {
	private String mType;
	private String ord;
	public String getmType() {
		return mType;
	}
	public void setmType(String mType) {
		this.mType = mType;
	}
	public String getOrd() {
		return ord;
	}
	public void setOrd(String ord) {
		this.ord = ord;
	}
	@Override
	public String toString() {
		return "MovieAll [mType=" + mType + ", ord=" + ord + "]";
	}
	
}
