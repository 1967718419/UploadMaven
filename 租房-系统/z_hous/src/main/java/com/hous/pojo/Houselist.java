package com.hous.pojo;

import org.springframework.web.multipart.MultipartFile;

public class Houselist extends HouselistKey {

    private String address;

    private Double area;

    private Double price;

    private String status;

    private String img;

    private String introduce;

    private String landlady;
    
    private MultipartFile file;

   
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getLandlady() {
        return landlady;
    }

    public void setLandlady(String landlady) {
        this.landlady = landlady == null ? null : landlady.trim();
    }
}