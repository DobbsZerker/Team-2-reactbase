import React from "react";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { useNavigate } from "react-router-dom";
// bcrypt is unhappy about react, there are work arounds... to be continued time allowing
//import bcrypt from "bcryptjs";

const Register = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [passConfirm, setPassConfirm] = useState("");
  const [id, setId] = useState("");
  const [authorized, isAuthorized] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();

  class User {
    constructor(username, password) {
      this.username = username;
      this.password = password;
      this.authorized = true;
      this.id = id;
    }
  }

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError("");
    if (username === "" || password === "" || passConfirm === "") {
      setError("Please enter a username and password");
    } else if (password !== passConfirm) {
      setError("Passwords do not match");
    } else {
      setError(null);
      let user = new User(username, password);
      // bcrypt.hash(user.password, 10, (err, hash) => {})
      // ^^ this is where i would encode the password, unless server side encryption becomes my chosen solution
      await fetch("http://54.172.240.244/user/add", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
          "mode": "cors",
          "Access-Control-Allow-Origin": "*",
        },
        body: JSON.stringify(user),

      }).catch((error) => {
        window.alert(error);
        console.log(user);

        return;
      });
      window.alert("User created, returning to login");
      setUsername("");
      setPassword("");
      isAuthorized(true);
      navigate("/");
    }
  };

  return (
    <div>
      <h1>Register</h1>
      <form id="registerForm" onSubmit={handleSubmit}>
        <label>Username:</label>
        <input
          type="text"
          name="username"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
        <br />
        <label>Password:</label>
        <input
          type="password"
          name="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <br />
        <label>Confirm Password:</label>
        <input
          type="password"
          name="password"
          value={passConfirm}
          onChange={(e) => setPassConfirm(e.target.value)}
        />
        <br />
        <input id="submit" type="submit" value="Register" />
      </form>
      {error ? <p className="error">{error}</p> : null}
      <div>
        <p>
          Already have an account? <Link to="/"> Login here.</Link>
        </p>
      </div>
    </div>
  );
};

export default Register;
