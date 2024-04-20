package org.example.MapDemo;

public class Ticket {
    public String ticketId;
    public String staus;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", staus='" + staus + '\'' +
                '}';
    }
    @Override
    public boolean equals( Object object) {
        if (this == object) {
            return true;

        }
        if (this.getClass() != object.getClass()) {
            return false;
        }


        Ticket ticket = (Ticket) object;

        return this.ticketId.equals(ticket.ticketId);



    }
    @Override
    public int hashCode(){
        return this.ticketId.hashCode()+this.staus.hashCode();
    }


}

