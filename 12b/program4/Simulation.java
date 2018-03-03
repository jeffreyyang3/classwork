//Jeffrey Yang
//1606512
//CMPS 12B
//  2/22/2018
// Simulates a run of jobs with different numbers of processors
//-----------------------------------------------------------------------------
// SimulationStub.java
//-----------------------------------------------------------------------------

import java.io.*;
import java.util.Scanner;


public class Simulation{

//-----------------------------------------------------------------------------
//
// The following function may be of use in assembling the initial backup and/or
// storage queues.  You may use it as is, alter it as you see fit, or delete it
// altogether.
//
//-----------------------------------------------------------------------------

    public static Job getJob(Scanner in) {
        String[] s = in.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        return new Job(a, d);
    }
    public static int findLine(Queue[] q){
        int temp = 1;

        for(int i = 2; i < q.length; i++){
            if(q[i].length() < q[temp].length()){
                temp = i;
            }

        }
        return temp;


    }

//-----------------------------------------------------------------------------
//
// The following stub for function main contains a possible algorithm for this
// project.  Follow it if you like.  Note that there are no instructions below
// which mention writing to either of the output files.  You must intersperse
// those commands as necessary.
//
//-----------------------------------------------------------------------------

    public static void main(String[] args) throws IOException{
        String bar = "*****************************";

//    1.  check command line arguments
        if (args.length != 1){
            System.err.println("Usage: Simulation inputfile");
            System.exit(1);
        }
//
//    2.  open files for reading and writing

        PrintWriter trace = new PrintWriter(new FileWriter(args[0]+".trc"));
        PrintWriter report = new PrintWriter(new FileWriter(args[0]+".rpt"));
//
//    3.  read in m jobs from input file
        Scanner init = new Scanner(new File(args[0]));
        int numjobs = Integer.parseInt(init.nextLine());
        Queue storage = new Queue();

        while(init.hasNext()){
            storage.enqueue(getJob(init));
        }



        trace.println("Trace file: "+args[0]+".trc");
        trace.println(numjobs +" Jobs:");
        trace.println(storage.toString());
        trace.println();
        report.println("Report file: "+args[0]+ ".rpt");
        report.println(numjobs + " Jobs:");
        report.println(storage +"\n");
        report.println("***********************************************************");
        int time = 0;
        int totalWait = 0;
        int maxWait = 0;
//
//    4.  run simulation with n processors for n=1 to n=m-1
        for(int i = 1; i < numjobs;i++){
            time = 0;
            totalWait = 0;
            maxWait = 0;
            Queue[] processorS = new Queue[i+1];
            processorS[0] = storage.copyQueue();
            for(int w = 1; w < processorS.length; w++){
                processorS[w] = new Queue();
            }
            if(i == 1){
                trace.println(bar);
                trace.println("1 processor:");
                trace.println(bar);
            }
            else{

                trace.println(bar);
                trace.println(i + " processors:");
                trace.println(bar);

            }



            Queue completed = new Queue();

            while(completed.length() != numjobs) { //checks job times and adds completed jobs to completed queue
                Boolean action = false; // flag for print
                for (int m = 1; m < processorS.length; m++) {
                    if (!processorS[m].isEmpty()) { //

                        if (((Job) processorS[m].peek()).getFinish() == time) {
                            completed.enqueue(processorS[m].dequeue());
                            if (!processorS[m].isEmpty()) {
                                ((Job)processorS[m].peek()).computeFinishTime(time);

                                int wait = time - ((Job)processorS[m].peek()).getArrival();
                                //System.out.println("wait: " + wait);
                                totalWait += wait;
                                if (maxWait < wait) {
                                    maxWait = wait;
                                }
                            }
                            action = true;
                        }

                    }
                }


                while (!processorS[0].isEmpty() && ((Job) processorS[0].peek()).getArrival() == time) { //account for two jobs arriving same time
                    Job curr = (Job) processorS[0].dequeue();

                    int availTime = time;
                    int availIndex = findLine(processorS);
                    if (!processorS[availIndex].isEmpty()) {
                        availTime = ((Job) processorS[availIndex].peekback()).getFinish();
                        //curr.computeFinishTime(time);
                    }

                    curr.computeFinishTime(availTime);
//                    System.out.println("totalWait: " + totalWait);
//                    int wait = availTime - time;
//                    System.out.println("wait: " + wait);
//                    totalWait += curr.getWaitTime();
//                    if (maxWait < curr.getWaitTime()) {
//                        maxWait = curr.getWaitTime();
//                    }
                    if (availTime != time) {
                        curr.resetFinishTime();
                    }

                    processorS[availIndex].enqueue(curr);
                    action = true;
                }


                if (action || time == 0) {


                    trace.println("time=" + time);

                    trace.println("0: " + processorS[0] + completed);

                    for (int z = 1; z < processorS.length; z++) {
                        trace.println(z + ": " + processorS[z]);



                    }
                    trace.println();



                }

                time++;

            }

            while (!completed.isEmpty()) {  //resets for next simulation
                ((Job)completed.dequeue()).resetFinishTime();
            }
            double averagewait = (double) totalWait / (double) numjobs;
            String averagewait1 = String.format ("%.2f", averagewait);


            if(i == 1) {
                report.println("1 processor: totalWait=" + totalWait + ", maxWait=" + maxWait + ", averageWait=" + averagewait1);
            }
            else{
                report.println( i+ " processors: totalWait=" + totalWait + ", maxWait=" + maxWait + ", averageWait=" + averagewait1);
            }


        }



        trace.close();


        report.close();



    }
}



