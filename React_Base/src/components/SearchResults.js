import React from "react";

function SearchResults(searchResults) {
  console.log(searchResults.searchResults);
  return (
    <div className="search-data">
      {searchResults &&
        searchResults.searchResults.map((result) => (
          <div className="searchRestaurant" key={result.business_name}>
            <ul>
              <ul>
                <li className="searchRestaurant">
                  <b>City:</b> {result.city}
                </li>
                <li className="searchRestaurant">
                  <b>Address:</b> {result.address}
                </li>
                <li className="searchRestaurant">
                  <b>categories:</b> {result.categories}
                </li>
                <li className="searchRestaurant">
                  <b>stars:</b> {result.stars}
                </li>
                <li className="searchRestaurant">
                  <b>Review Count:</b> {result.review_count}
                </li>
              </ul>
            </ul>
            <hr />
          </div>
        ))}
    </div>
  );
}

export default SearchResults;