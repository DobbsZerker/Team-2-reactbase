import { useState, useRef } from "react";
import axios from "axios";
import SearchResults from "../components/SearchResults";
import React from "react";
import Topbar from "../components/Topbar";

function Search() {
  const [searchResults, setSearchResults] = useState(false);
  const searchRef = useRef();
  const databaseRef = useRef();

  const handleSubmit = async (e) => {
    e.preventDefault();
    const searchValue = searchRef.current.value;
    const databaseValue = databaseRef.current.value;

    if (databaseValue === "business_id") {
      const res = await axios.get(
        `http://localhost:8080/restaurant/${searchValue}`
      );

      const businessData = [];
      businessData.push(res.data);
      console.log(businessData);
      setSearchResults(businessData);
    }

    if (databaseValue === "business_name") {
      const res = await axios.get(
        `http://localhost:8080/restaurant/search/findByBusinessName?business_name=${searchValue.replace(
                                                                                                          " ",
                                                                                                          "%20"
      )}`
      );
 const businessData = [];
      businessData.push(res.data._embedded.restaurant)
      console.log(businessData);
      console.log()
      setSearchResults(businessData[0])
    }

    if (databaseValue === "city") {
      const res = await axios.get(
        `http://localhost:8080/restaurant/search/findByCity?city=${searchValue.replace(
                                                                                         " ",
                                                                                         "%20"
       )}`
       );
      const businessData = [];
            businessData.push(res.data._embedded.restaurant)
            console.log(businessData);
            console.log()
            setSearchResults(businessData[0])
    }



//    if (databaseValue === "address") {
//      const res = await axios.get(
//        `http://localhost:8080/restaurant/search/findByAddress?address=${searchValue.replace(
//          " ",
//          "%20"
//        )}`
//      );
//      const businessData = [];
//            businessData.push(res.data._embedded.restaurant)
//            console.log(businessData);
//            console.log()
//            setSearchResults(businessData[0])
//    }
//
//    if (databaseValue === "city") {
//      const res = await axios.get(
//        `http://localhost:8080/restaurant/search/findByCity?city=${searchValue.replace(
//          " ",
//          "%20"
//        )}`
//      );
//      const businessData = [];
//            businessData.push(res.data._embedded.restaurant)
//            console.log(businessData);
//            console.log()
//            setSearchResults(businessData[0])
//    }
//
//    if (databaseValue === "categories") {
//      const res = await axios.get(
//        `http://localhost:8080/restaurant/search/findByCategories?country=${searchValue.replace(
//          " ",
//          "%20"
//        )}`
//      );
//      const businessData = [];
//            businessData.push(res.data._embedded.restaurant)
//            console.log(businessData);
//            console.log()
//            setSearchResults(businessData[0])
//    }

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
        <select name="dropdown" id="database" ref={databaseRef}>
          <option value="business_id">id</option>
          <option value="business_name">Business Name</option>
          <option value="city">City</option>


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

export default Search;