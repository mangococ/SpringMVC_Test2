package cn.com.mvc.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;



public class Fruits {
	private int id;//id����
    private String name; //ˮ����
    private double price; //�۸�
    private String producing_area; //���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProducing_area() {
		return producing_area;
	}
	public void setProducing_area(String producing_area) {
		this.producing_area = producing_area;
	}
}