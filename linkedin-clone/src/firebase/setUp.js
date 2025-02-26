// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAuths } from "firebase/auth";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCnDqe1E9QORfQB74c-wnT86mam8Q6v8Ow",
  authDomain: "linkedin-auth-6c098.firebaseapp.com",
  projectId: "linkedin-auth-6c098",
  storageBucket: "linkedin-auth-6c098.firebasestorage.app",
  messagingSenderId: "235578957370",
  appId: "1:235578957370:web:b1a6aa9a049e49f266df03",
  measurementId: "G-BTPS4JVW2Y"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const auth = getAuths(firebaseConfig);

export {app,auth};
