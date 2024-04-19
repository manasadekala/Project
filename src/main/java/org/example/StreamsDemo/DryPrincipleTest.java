package org.example.StreamsDemo;

import org.example.Pagination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DryPrincipleTest {
    public void ticketStatus(List<Ticket> ticketList, Predicate<Ticket>predicate){
        Iterator<Ticket>iterator=ticketList.iterator();
        for (;iterator.hasNext();){
            Ticket ticket=iterator.next();
            if (predicate.test(ticket)){
                System.out.println("Ticket status"+ticket.status);


            }
        }
    }

    public static void main(String[] args) {
        Predicate<Ticket>status=(Ticket) -> Ticket.status.equals("Success");
        Predicate<Ticket>failed=(Ticket) -> Ticket.status.equals("failed");
        Predicate<Ticket>locked=(Ticket)-> Ticket.status.equals("locked");
        Ticket ticket=new Ticket();
        ticket.ticketId="142425";
        ticket.status="success";

        Ticket ticket1 =new Ticket();
        ticket1.ticketId="43663";
        ticket1.status="success";

        Ticket ticket2=new Ticket();
        ticket2.status="locked";
        ticket2.ticketId="4444";

        Ticket ticket3=new Ticket();
        ticket3.ticketId="6666";
        ticket3.status="locked";

        Ticket ticket4=new Ticket();
        ticket4.status="failed";
        ticket4.ticketId="111";

        List<Ticket>list=new ArrayList<>();
        list.add(ticket);
        list.add(ticket1);
        list.add(ticket2);
        list.add(ticket3);
        list.add(ticket4);

        DryPrincipleTest dryprincple=new DryPrincipleTest();
        dryprincple.ticketStatus(list,status);
        dryprincple.ticketStatus(list,failed);
        dryprincple.ticketStatus(list,locked);



    }
}