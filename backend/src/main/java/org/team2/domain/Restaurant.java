
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

	@ManyToOne(optional = false)
	@NaturalId
	private String city;

	@Column(nullable = false)
	@NaturalId
	private String business_name;



	@Column(nullable = false)
	private String address;


	@Column(nullable = false)
	private String categories;

	@Column(nullable = false)
	private Integer review_count ;



	@Column(nullable = false)
	private Integer stars;

	protected Restaurant() {
	}





	public Restaurant(String city, String name, Integer stars, Integer review_count, String categories, String address, Long id) {
		this.city = city;
		this.business_name = name;
		this.address = address;
		this.stars = stars;
		this.review_count = review_count;
		this.categories = categories;
		this.id = id;

	}

	public String getCity() {
		return this.city;
	}

	public String getName() {
		return this.business_name;
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
		return review_count;
	}

	public void setReview_count(Integer review_count) {
		this.review_count = review_count;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.business_name = name;
	}


	@Override
	public String toString() {
		return "Restaurant{" +
				"id=" + id +
				", city='" + city + '\'' +
				", business_name='" + business_name + '\'' +
				", address='" + address + '\'' +
				", categories='" + categories + '\'' +
				", review_count=" + review_count +
				", stars=" + stars +
				'}';
	}



}
