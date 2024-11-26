# Matchday Manager

Simulation application for UEFA Euro 2024.

What the app will do:
The user is presented with the list of participating countries in the knockout stage of UEFA Euro 2024 from which he will choose a team. This will be the User Team, while the rest are considered
Computer Teams.

Each team/country will have 22 players - you can generate their names, use friends
name etc., there is no need to use the real names

Each player will have at least 4 attributes - Position (Goalkeeper , Defender, Midfielder,
Attacker), Defence (a score from 0 to 100), Passing ( a score from 0 to 100), Shooting (a
score from 0 to 100). For bonus points/creativity you can add as many attributes as you
would like. These can also be generated.

Once the user selects a team, the draw of the knockout stage should be presented to
him.

The main loop of our simulator begins:
- The user must arrange the team for the next game. He is presented with the list
  of players and their attributes and must select 11 of them and arrange them in
  their right positions. There should be 1 Goalkeeper, 4 Defenders, 4 Midfielders
  and 2 Attackers in the final formation.
- The simulation of the game begins and at the end of the game the user is
  presented with a result.
- The rest of the games are simulated and all the results are presented.
- If the user won and has qualified - resume the loop with the next stage of the
  competition.
- If the user lost - show a message and the game is restarted.

Simulating a game between the User Team and a Computer Team:
- A score of both teams should be computed.
- The final score presented should be based on the scoring and a random factor.
- The score should be based on the players’ attributes.
- If the user has misplaced a player - used a Goalkeeper as an Attacker - the team
  score should be heavily affected/lowered.
- The other/Computer team is always arranged well.

Simulating a game between two Computer Teams:
- A score of both teams should be computed.
- The final score presented should be based on the scoring and a random factor.
- The score should be based on the players’ attributes.
- The other/Computer team is always arranged well.

## How to run the app:
### Start the backend:
1. Navigate to `backend` folder
2. Run the command `./mvnw spring-boot:run`

### Start the frontend:
1. Navigate to `frontend/Matchday-Manager` folder
2. Run the command `npm install`
3. Run the command `npm run dev`
4. Click the link in your console or go to http://localhost:5173/
5. Enjoy the app!
