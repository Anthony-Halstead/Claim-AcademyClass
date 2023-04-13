package WeekOne;

public class Car 
{
    private String make;
    private String model;
    private int year;
    private double speed;
    private double maxSpeed;


    //Constructor
    public Car(String make, String model, int year, double speed, double maxSpeed)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    //Getter and Setters
    public String GetMake(){
        return make;
    }
    public String GetModel(){
        return model;
    }
    public int GetYear(){
        return year;
    }
    public double GetSpeed(){
        return speed;
    }
    public double GetMaxSpeed(){
        return maxSpeed;
    }

    public void SetMake(String make)
    {
        this.make = make;
    }
    public void SetModel(String model)
    {
        this.model = model;
    }
    public void SetYear(int year)
    {
        this.year = year;
    }
    public void SetSpeed(double speed)
    {
        this.speed = speed;
    }
    public void SetMaxSpeed(double maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    //Behavior Methods
    public void SpeedUp()
    {
        if(this.speed<maxSpeed)
        {
            this.speed++;
            System.out.println("Speeding up the new speed is: "+speed);
        }
        else
        System.out.println("Max speed is already reached: "+maxSpeed);
        
    }
    public void SlowDown()
    {
        if(this.speed > 0)
        {
            this.speed--;
            System.out.println("You are slowing down your new speed is: "+speed);

            if(speed==0)
            System.out.println("You are at a complete stop");          
        }
        else
        System.out.println("The car is already at a complete stop");
    }
}
