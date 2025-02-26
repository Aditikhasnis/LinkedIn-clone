
import './App.css';
import Login from './components/Login';
import home from './components/home';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
function App() {
  return (
    <div className="App">
      <Router>
            <Routes>       
                <Route path="/" element={<Login />} />
                <Route path="/home" element={<home/>}/>
            </Routes>
     </Router>
    </div>
  );
}

export default App;
