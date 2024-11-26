import {useEffect, useState} from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import axios from "axios";

function App() {
    const [teams, setTeams] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:8080/teams').then(
            (response) => setTeams(response.data)
        )
    }, []);
  return (
    <>
        <h1>Hello to home page!</h1>
        {
            teams.map(team => <div>{team.name}</div>)
        }
    </>
  )
}

export default App
