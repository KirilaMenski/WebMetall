package by.eftech.web_metall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "metall")
public class Metall {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "type")
	private String type;
	@Column(name = "type_eng")
	private String type_eng;
	@Column(name = "title")
	private String title;
	@Column(name = "gost")
	private String gost;
	@Column(name = "size")
	private String size;
	@Column(name = "model")
	private String model;
	@Column(name = "length")
	private String length;
	@Column(name = "price")
	private double price;
	@Column(name = "k")
	private String k;

	public Metall() {

	}

	public Metall(long id, String type, String type_eng, String title,
			String gost, String size, String model, String length, double price,
			String k) {

		this.id = id;
		this.type = type;
		this.type_eng = type_eng;
		this.title = title;
		this.gost = gost;
		this.size = size;
		this.model = model;
		this.length = length;
		this.price = price;
		this.k = k;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType_eng() {
		return type_eng;
	}

	public void setType_eng(String type_eng) {
		this.type_eng = type_eng;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGost() {
		return gost;
	}

	public void setGost(String gost) {
		this.gost = gost;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

}
