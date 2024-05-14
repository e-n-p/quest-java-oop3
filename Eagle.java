public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " takes off in the sky");
    }

    @Override
    public void ascend(int amount) {
        this.altitude += amount;
        System.out.printf("%s flies upward, altitude: %s\n", this.getName(), this.getAltitude());
    }

    @Override
    public void glide() {
        System.out.println("glides into the air.");
    }

    @Override
    public void descend(int amount) {
        this.altitude -= amount;
        System.out.printf("%s flies downward, altitude: %s\n", this.getName(), this.getAltitude());

    }

    @Override
    public void land() {
        if (this.getAltitude() > 1){
            System.out.printf("%s is too high, it can't land.\n",this.getName());
        } else {
            System.out.printf("%s lands on the ground\n", this.getName());
        }
    }
}
