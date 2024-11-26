import react, {useEffect, useState} from 'react'
import axios from "axios";
import {Link} from "react-router-dom";
import { useNavigate } from "react-router-dom"

const Players = () => {
    let navigate = useNavigate();
    const [players, setPlayers] = useState([]);
    const [selectedPlayer, setSelectedPlayer] = useState(null); // To hold the selected player data

    // Fetch all players on initial load
    useEffect(() => {
        axios.get('http://localhost:8080/players').then(
            (response) => setPlayers(response.data)
        );
    }, []);

    // Fetch player details by ID when a player is clicked
    const fetchPlayerById = (id) => {
        axios.get(`http://localhost:8080/players/${id}`).then((response) => {
            setSelectedPlayer(response.data); // Store the selected player's data
        }).catch((error) => {
            console.error("Error fetching player:", error);
        });
    };

    return (
        <div>
            <h1>Hello to the players page!</h1>

            {/* Render the list of players */}
            <div>
                {players.map((player) => (
                    <div
                        key={player.id}
                        style={{cursor: 'pointer'}}
                        onClick={() => fetchPlayerById(player.id)} // Fetch player on click
                    >
                        {player.name}
                    </div>
                ))}
            </div>

            {/* Display the selected player's details */}
            {selectedPlayer && (
                <div>
                    <h2>Selected Player Details</h2>
                    <p>ID: {selectedPlayer.id}</p>
                    <p>Name: {selectedPlayer.name}</p>
                    <p>Position: {selectedPlayer.position}</p>
                    <p>Defence: {selectedPlayer.defence}</p>
                    <p>Passing: {selectedPlayer.passing}</p>
                    <p>Shooting: {selectedPlayer.shooting}</p>
                </div>
            )}
            <button onClick={() => navigate(-1)}>Go to home page</button>
        </div>
    )
}

export default Players