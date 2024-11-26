import react from 'react';
import './App.css';
import {Route, Routes} from "react-router";
import Home from "./pages/Home.jsx";
import Players from "./pages/Players.jsx";

function App() {

    return (
        <>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/players" element={<Players />} />
            </Routes>
        </>
    );
}

export default App;
