import { useEffect, useState } from 'react';
import './App.css';
import axios from 'axios';

function App() {
    const [teams, setTeams] = useState([]);
    const [selectedTeam, setSelectedTeam] = useState(null); // To hold the selected team data

    // Fetch all teams on initial load
    useEffect(() => {
        axios.get('http://localhost:8080/teams').then(
            (response) => setTeams(response.data)
        );
    }, []);

    // Fetch team details by ID when a team is clicked
    const fetchTeamById = (id) => {
        axios.get(`http://localhost:8080/teams/${id}`).then((response) => {
            setSelectedTeam(response.data); // Store the selected team's data
        }).catch((error) => {
            console.error("Error fetching team:", error);
        });
    };

    return (
        <div>
            <h1>Hello to the home page!</h1>

            {/* Render the list of teams */}
            <div>
                {teams.map((team) => (
                    <div
                        key={team.id}
                        style={{ cursor: 'pointer'}}
                        onClick={() => fetchTeamById(team.id)} // Fetch team on click
                    >
                        {team.name}
                    </div>
                ))}
            </div>

            {/* Display the selected team's details */}
            {selectedTeam && (
                <div>
                    <h2>Selected Team Details</h2>
                    <p>ID: {selectedTeam.id}</p>
                    <p>Name: {selectedTeam.name}</p>
                    {/* Add other team details as needed */}
                </div>
            )}
        </div>
    );
}

export default App;
