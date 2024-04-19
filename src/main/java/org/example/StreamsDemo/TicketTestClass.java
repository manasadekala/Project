package org.example.StreamsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class TicketTestClass {
    public static void main(String[]args){
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

        Iterator<Ticket> iterator=list.iterator();
        for (;iterator.hasNext();) {
            Ticket ticket5 = iterator.next();
            System.out.println("iterator Ticket Status" + ticket5.status);
        }
            for (; iterator.hasNext(); ) {
                Ticket ticket6 = iterator.next();
                System.out.println("iterator Ticket Status" + ticket6.status);
            }

                for (; iterator.hasNext(); ) {
                    Ticket ticket7 = iterator.next();
                    System.out.println("iterator Ticket Status" + ticket7.status);
                }


                    Predicate<Ticket> predicatestatus = (predicateTicket) ->
                            predicateTicket.status.equals("successfull");


                }


            }

