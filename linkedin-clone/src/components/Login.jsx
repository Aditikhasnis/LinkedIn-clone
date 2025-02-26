import React, { useState } from "react";
import "./Login.css";  // Ensure you have styles applied
import Card from "@material-ui/core/Card";
import styled from 'styled-components';

export function AuthProvider({childern})
{
  const [user , setUser ] = useState("");
  const [userLogged , setuserLogged] = useState(false);
  const [loading,setloading]=useState(true);

}

function Login() {
    
    const AuthContext = React.AuthContext;


    const SignUp = styled.div`
   
 
  padding: 10px;
 font-size: 2rem;
 display : flex;
 justify-content : left;
 


`;

 const Google = styled.div`

 margin-top:100px;
 padding:10px;

  
`;

const InputField =styled.div`
 display: grid;
 grid-template-columns: 1fr;
 gap: 15px;
  width: 50%;
margin-left:150px;
margin-top:50px;
`;



    
    return (
        <div className="main">


        <h1 className="logo">
            Linked <img src="/assets/linkedin-icon-free-png.webp" alt="LinkedIn Logo" className="logo-img" />
        </h1>
        <Card className="Card">
            <SignUp> Sign In</SignUp>
      <h1 className="welcome">
        Welcome to Professional Community
      </h1>
      

       <InputField>

        <label for=""> Email</label>
        <input type="email" class="form-control" name="" id="" aria-describedby="emailHelpId" placeholder="Enter Your mail ID"/>
        
     
        <label> Password</label>

        <input type="password" placeholder="Enter 8 digit character here"/>
        <div className="forgot">
        <link rel="stylesheet" href="" className="forgot"/> forgot password ?
        </div>
        <button className="btn_sign">Sign in</button>

        </InputField>
  
       <div className="google">

        
       <Google>
       
        <button className="btn_gugu">
        <img className="gugu_img"src="https://www.svgrepo.com/show/303108/google-icon-logo.svg" alt="" width="20" hright="10"/ >
        Sign In with google 🚀
        </button>
       
       </Google>
       </div>
        </Card>

        </div>

    );
}

export default Login;