package com.mypack.entity;

public class Goods {
	int goodsId;
	String goodsName;
	double price;
	String spec;//规格
	String imgPath;//图片路径
	int type_id;//商品类型编号
	int kucun;//库存
	String chandi;//产地
	String bak;//备注 描述信息
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int goodsId, String goodsName, double price, String spec,
			String imgPath, int type_id, int kucun, String chandi, String bak) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.price = price;
		this.spec = spec;
		this.imgPath = imgPath;
		this.type_id = type_id;
		this.kucun = kucun;
		this.chandi = chandi;
		this.bak = bak;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getKucun() {
		return kucun;
	}
	public void setKucun(int kucun) {
		this.kucun = kucun;
	}
	public String getChandi() {
		return chandi;
	}
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	public String getBak() {
		return bak;
	}
	public void setBak(String bak) {
		this.bak = bak;
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName
				+ ", price=" + price + ", spec=" + spec + ", imgPath="
				+ imgPath + ", type_id=" + type_id + ", kucun=" + kucun
				+ ", chandi=" + chandi + ", bak=" + bak + "]";
	}
	

}
