package ExamPreparation_JavaAdvanced.Archive_AdvancedJava_Exams.JavaAdvancedRetakeExam_27August2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class p04Agents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> agentList = new ArrayList<>();
        List<Missions> missionList = new ArrayList<>();

        String command = "";
        while (!"registration".equals(command = reader.readLine())) {
            if (command.startsWith("#")) {
                String[] tokens = command.split(":");
                missionList.add(new Missions(tokens[0], Double.parseDouble(tokens[1])));
            } else if (command.substring(command.length() - 3).charAt(0) == '0') {
                agentList.add(command);
            }
        }
        Map<String, Agent> agentMissionMap = new LinkedHashMap<>();


        while (!"operate".equals(command = reader.readLine())) {
            String[] tokens = command.split("->");
            if (tokens[0].equals("assign")) {
                String agentName = tokens[1];
                String missionName = tokens[2];
                agentMissionMap.putIfAbsent(agentName, new Agent());
                if (agentList.contains(agentName) &&
                        isMissiontExist(missionName, missionList) &&
                        !agentMissionMap.get(agentName).isitMissionExist(missionName)) {

                    //agentMissionMap.put(agentName, new Agent(getMision(missionName, missionList)));
                    agentMissionMap.get(agentName).setMissions(getMision(missionName, missionList));
                }
            } else if (tokens[0].equals("abort")) {
                String missionName = tokens[1];
                for (Agent agents : agentMissionMap.values()) {
                    agents.removeMissions(missionName);
                }
            } else if (tokens[0].equals("change")) {
                String agent1 = tokens[1];
                String agent2 = tokens[2];
                Agent agentTemp = agentMissionMap.get(agent1);
                agentMissionMap.replace(agent1, agentMissionMap.get(agent2));
                agentMissionMap.replace(agent2, agentTemp);
            }

        }
        agentMissionMap.entrySet().stream()
                .filter(e -> e.getValue().getMissions().size() != 0)
                .sorted((f, s) -> Double.compare(s.getValue().getTotalRating(), f.getValue().getTotalRating()))
                .forEach(e -> {
                    System.out.println(String.format(
                            "Agent: %s - Total Rating: %.2f"
                            , e.getKey()
                            , e.getValue().getTotalRating()
                    ));
                    e.getValue().getMissions().forEach(m -> {
                        System.out.println(String.format(
                                "- %s -> %.2f"
                                , m.getName()
                                , m.getRating()
                        ));
                    });
                });
    }


    private static Missions getMision(String missionName, List<Missions> missionList) {
        Missions missions = null;
        for (Missions mission : missionList) {
            if (mission.getName().equals(missionName)) {
                missions = mission;
            }
        }
        return missions;

    }

    private static boolean isMissiontExist(String missionName, List<Missions> missionList) {

        for (Missions missions : missionList) {
            if (missions.getName().equals(missionName)) {
                return true;
            }
        }
        return false;
    }

}

class Agent {
    private List<Missions> missions;

    public Agent() {
        this.missions = new ArrayList<>();
    }

    public Agent(Missions missions) {
        this.missions = new ArrayList<>();
        this.missions.add(missions);
    }

    public List<Missions> getMissions() {
        return this.missions;
    }

    public void setMissions(Missions missions) {
        this.missions.add(missions);
    }

    public double getTotalRating() {
        return this.missions.stream().mapToDouble(Missions::getRating).sum();
    }

    public boolean isitMissionExist(String mission) {
        if (this.missions.size() == 0) {
            return false;
        }
        for (Missions m : this.missions) {
            if (m.getName().equals(mission)) {
                return true;
            }
        }
        return false;
    }

    public void removeMissions(String mission) {
        this.missions.removeIf(m -> m.getName().equals(mission));
    }

}

class Missions {
    private String name;
    private double rating;

    public Missions(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }

    public String getName() {
        return name;
    }
}
