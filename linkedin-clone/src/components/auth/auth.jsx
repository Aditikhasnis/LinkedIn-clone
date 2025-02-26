
import { onAuthStateChanged } from "firebase/auth";
import React, { Children, useContext,useEffect,useState } from "react";

import { auth } from "../../firebase/setUp";
import { initializeApp } from "firebase/app";

const AuthContext= React.createContext();
export function useAuth()
{
    return useContext(AuthContext);
}
export function AuthProvider({childern})
{
  const [user , setUser ] = useState("");
  const [userLogged , setuserLogged] = useState(false);
  const [loading,setloading]=useState(true);
 useEffect(()=>{

    const unsubscribe =onAuthStateChanged(auth,initializeUser);
    return unsubscribe;
 },[])

 async function initializeUser(user)
 {
    try {
        if(user)
            {
                setUser({...user});
                setuserLogged(true);
            }
            setloading(false);
        
    } catch (error) {
        console.log(error);
    }

}

const value ={
    user,
    userLogged,
    loading

}

return (
<>
<AuthContext.Provider value={value
}>  {!loading && childern}
</AuthContext.Provider>

</>
)
}