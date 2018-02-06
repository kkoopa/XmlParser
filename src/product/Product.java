package product;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
/**
 *
 * @author bbyholm
 */
@XmlRootElement
@XmlAccessorType(FIELD)
public class Product {

	@XmlAttribute
	private int id;
	@XmlAttribute
	private int optLockVersion;

	@XmlElement
	private String barCode;
	@XmlElement
	private String name;
	@XmlElement
	private Double vat;
	@XmlElement
	private String keyword;

	/**
	 * @return the barCode
	 */
	public String getBarCode() {
		return barCode;
	}

	/**
	 * @param barCode the barCode to set
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the optLockVersion
	 */
	public int getOptLockVersion() {
		return optLockVersion;
	}

	/**
	 * @param optLockVersion the optLockVersion to set
	 */
	public void setOptLockVersion(int optLockVersion) {
		this.optLockVersion = optLockVersion;
	}

	/**
	 * @return the vat
	 */
	public Double getVat() {
		return vat;
	}

	/**
	 * @param vat the vat to set
	 */
	public void setVat(Double vat) {
		this.vat = vat;
	}

	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return new StringBuilder("id: ").append(id).append("\noptLockVersion: ").
			append(optLockVersion).append("\nbarCode: ").append(barCode).
			append("\nname: ").append(name).append("\nvat: ").append(vat).
			append("\nkeyword: ").append(keyword).toString();
	}
}
