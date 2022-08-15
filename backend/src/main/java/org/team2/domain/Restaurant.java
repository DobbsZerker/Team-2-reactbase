
package org.team2.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;
//import org.hibernate.annotations.Table;


@Entity
@Table(name = "restaurant")
public class Restaurant implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer businessId;


	@NaturalId
	private String city;

	@NaturalId
	private String businessName;




	private String address;

	private String categories;

	private Integer reviewCount ;

	private Integer stars;



	protected Restaurant() {
	}





	public Restaurant(String city, String name, Integer stars, Integer reviewCount, String categories, String address, Integer id) {
		this.businessId = id;
		this.businessName = name;
		this.city = city;
		this.address = address;
		this.categories = categories;
		this.stars = stars;
		this.reviewCount = reviewCount;


	}

	public String getCity() {
		return this.city;
	}

	public String getName() {
		return this.businessName;
	}

	public String getAddress() {
		return this.address;
	}

	public Integer getStars() {
		return this.stars;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void setStars(Integer stars) {
		this.stars= stars;
	}


	public String getCategories() {
		return this.categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}

	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.businessName = name;
	}


	@Override
	public String toString() {
		return "Restaurant{" +
				"id=" + businessId +
				", city='" + city + '\'' +
				", business_name='" + businessName + '\'' +
				", address='" + address + '\'' +
				", categories='" + categories + '\'' +
				", review_count=" + reviewCount +
				", stars=" + stars +
				'}';
	}



}
