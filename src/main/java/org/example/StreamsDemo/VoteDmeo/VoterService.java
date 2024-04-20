package org.example.StreamsDemo.VoteDmeo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class VoterService {
    public void voteStatus(List<Voter>voterList,Predicate<Voter>predicate,Predicate<Voter>predicate1){
        Iterator<Voter>iterator=voterList.iterator();
        for (;iterator.hasNext();){
            Voter voter=iterator.next();
            if (predicate.test(voter)){
                System.out.println("not eligible"+voter.voterId);

            }
            if (predicate1.test(voter)){
                voter.status="yes";
                System.out.println("eligible"+voter.voterId);
            }
        }



    }
    public static void main(String[]args){
        Predicate<Voter>yespredicate=Voter->
                Voter.status.equals("yes");
        Predicate<Voter>nopredicate=Voter->
                Voter.status.equals("No");
        Voter voter1=new Voter();
        voter1.status="yes";
        voter1.voterId="999";

        Voter voter2=new Voter();
        voter2.status="yes";
        voter2.voterId="647";

        Voter voter3=new Voter();
        voter3 .status="No";
        voter3.voterId="555";

        Voter voter4=new Voter();
        voter4.voterId="999";
        voter4.status="No";

        List<Voter>list=new ArrayList<>();
        list.add(voter1);
        list.add(voter2);
        list.add(voter3);
        list.add(voter4);
        list.add(voter4);



VoterService voterService=new VoterService();
voterService.voteStatus(list,yespredicate,nopredicate);

    }

}
