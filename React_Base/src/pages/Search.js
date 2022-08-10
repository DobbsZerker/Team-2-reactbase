import { useState, useRef } from "react";
import axios from "axios";
import SearchResults from "../components/SearchResults";
import React from "react";

function SearchPage() {
  const [searchResults, setSearchResults] = useState(false);
  const searchRef = useRef();
  const databaseRef = useRef();

  const handleSubmit = async (e) => {
    e.preventDefault();
    const searchValue = searchRef.current.value;
    const databaseValue = databaseRef.current.value;

    if (databaseValue === "business_id") {
      const res = await axios.get(
        `http://localhost:8080/business/${searchValue}`
      );

      const businessData = [];
      businessData.push(res.data);
      console.log(businessData);
      setSearchResults(businessData);
    }

    if (databaseValue === "business_name") {
      const res = await axios.get(
        `http://localhost:8080/business/search/findByBusiness_name?business_name=${searchValue}`
      );
      const businessData = res.data._embedded.business;
      console.log(businessData);
      setSearchResults(businessData);
    }

    if (databaseValue === "city") {
      const res = await axios.get(
        `http://localhost:8080/business/search/findByCity?city=${searchValue}`
      );
      const businessData = res.data._embedded.business;
      console.log(businessData);
      setSearchResults(businessData);
    }



    if (databaseValue === "address") {
      const res = await axios.get(
        `http://localhost:8080/business/search/findByAddress?address=${searchValue.replace(
          " ",
          "%20"
        )}`
      );
      const businessData = res.data._embedded.business;
      console.log(businessData);
      setSearchResults(businessData);
    }

    if (databaseValue === "city") {
      const res = await axios.get(
        `http://localhost:8080/business/search/findByCity?city=${searchValue.replace(
          " ",
          "%20"
        )}`
      );
      const businessData = res.data._embedded.business;
      console.log(businessData);
      setSearchResults(businessData);
    }

    if (databaseValue === "categories") {
      const res = await axios.get(
        `http://localhost:8080/business/search/findByCategories?country=${searchValue.replace(
          " ",
          "%20"
        )}`
      );
      const businessData = res.data._embedded.business;
      console.log(businessData);
      setSearchResults(businessData);
    }

    if (databaseValue === "accountBalance") {
      const res = await axios.get(
        `http://localhost:8080/business/search/findByStars?stars=${searchValue}`
      );
      const businessData = res.data._embedded.business;
      console.log(businessData)
      setSearchResults(businessData)
    }
  };
  return (
    <div>
      <Topbar />
      <form className="search-box" onSubmit={handleSubmit}>
        <input
          type="text"
          className="search"
          placeholder="Search database"
          ref={searchRef}
        ></input>
          <option value="business_id">id</option>
          <option value="business_name">Business Name</option>
          <option value="city">City</option>
          <option value="address">Address</option>
          <option value="categories">Categories</option>
          <option value="stars">Stars</option>
          <option value="review_count">Address</option>
        </select>
        <button className="submit">Search</button>
      </form>
      {searchResults ? (
        <SearchResults searchResults={searchResults} />
      ) : (
        "nodata"
      )}
    </div>
  );
}

export default SearchPage;
