
package org.team2.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;



@Entity
public class Restaurant implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;


	@NaturalId
	private String city;

	@Column(nullable = false)
	@NaturalId
	private String businessName;



	@Column(nullable = false)
	private String address;


	@Column(nullable = false)
	private String categories;

	@Column(nullable = false)
	private Integer reviewCount ;



	@Column(nullable = false)
	private Integer stars;

	protected Restaurant() {
	}





	public Restaurant(String city, String name, Integer stars, Integer reviewCount, String categories, String address, Long id) {
		this.city = city;
		this.businessName = name;
		this.address = address;
		this.stars = stars;
		this.reviewCount = reviewCount;
		this.categories = categories;
		this.id = id;

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

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategories() {
		return this.categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}

	public Integer getReview_count() {
		return reviewCount;
	}

	public void setReview_count(Integer review_count) {
		this.reviewCount = review_count;
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
				"id=" + id +
				", city='" + city + '\'' +
				", business_name='" + businessName + '\'' +
				", address='" + address + '\'' +
				", categories='" + categories + '\'' +
				", review_count=" + reviewCount +
				", stars=" + stars +
				'}';
	}



}
