package org.example.MapDemo;

import java.util.*;

public class MapDemoTest {
    public static void main(String[] args) {

        List<Ticket>list=new ArrayList<>();
        Map<Integer,Ticket>ticketMap=new HashMap<>();

        for (int i=0;i<1000;i++){
            Ticket ticket=new Ticket();
            ticket.staus="ticket confirm";
            ticket.ticketId="1"+i;
            list.add(ticket);
            ticketMap.put(ticket.hashCode(),ticket);


        }
        Ticket ticketfind=new Ticket();
        ticketfind.ticketId="199";
        ticketfind.staus="ticket confirm";
        long listStartTime=System.currentTimeMillis();


        Iterator<Ticket>iterator=list.iterator();
        for (;iterator.hasNext();){
            Ticket ticket=iterator.next();
           // System.out.println("ticket"+ticket);q
            if (ticket.equals(ticketfind)){
            System.out.println("ticket found"+ticket.ticketId);


        }

    }
        long listEndTime=System.currentTimeMillis();
        System.out.println("list excution"+(listEndTime-listStartTime));

        Set<Map.Entry<Integer,Ticket>> entrySetOfticket =ticketMap.entrySet();
        Iterator<Map.Entry<Integer,Ticket>> iterator1=entrySetOfticket.iterator();
        for (;iterator1.hasNext();) {
            Map.Entry<Integer, Ticket> entry=iterator1.next();
            System.out.println("key" + entry.getKey()+"valus" +entry.getValue());

        }


        long mapStartTime=System.currentTimeMillis();


        ticketMap.get(ticketfind);

        long mapEndTime=System.currentTimeMillis();
        System.out.println("map excution"+(mapEndTime-mapStartTime));


    }

}
