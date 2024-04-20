package org.example.StreamsDemo.VoteDmeo;

public class Voter {
    public String voterId;
    public String status;

    @Override
    public String toString() {
        return "Voter{" +
                "voterId='" + voterId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
