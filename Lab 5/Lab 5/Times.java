class Time{
    int hours, minutes, seconds;

    Time(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;

    }
     Time(String s){
        this.hours = Integer.parseInt(s.substring(0,2));
        this.minutes = Integer.parseInt(s.substring(3,5));
        this.secs=Integer.parseInt(s.substring(6,8));
     }
     void display(){
        System.out.println(+this.hours+":"+this.minutes+":"+this.seconds);

     }

     void addTime(Time t1, Time t2){
          int s=t1.secs+t2.secs;
        int m=t1.mins+t2.mins;
        int h=t1.hours+t2.hours;
        this.secs=s%60;
        this.mins=(m+s/60)%60;
        this.hours=(h+m/60)%24;
    }
}

class Times{
    public static void main(String args[]) {
           Time t1,t2,t3;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter time 1:");
        t1=new Time(scan.nextLine());
        System.out.print("Enter time 2:");
        t2=new Time(scan.nextLine());
        t3= new Time();
        t3.add(t1,t2);
        t3.display();
        scan.close();

    }
}
