package BusReservationSystem;

public class bus{
    private int busNo;
    private boolean ac;
    private int capacity;

    bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo() { //accessor method
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() { //accessor method
        return capacity;
    }

    public void setBusNo(int no) { //mutator method
        this.busNo = no;
    }

    public void setAc(boolean val) { //mutator method
        this.ac = val;
    }

    public void setCapacity(int cap) { //mutator method
        this.capacity = cap;
    }

   public void displayBusInfo(){
    System.out.println("BusNo:" + busNo + "Ac:" + ac + "Total Capacity:" + capacity);
   }
}