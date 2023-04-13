package WeekOne;

public class TestSite {
    public static void main(String[] args){
       Car tonysWhip = new Car("Toyota", "Camry", 2022, 0, 120);         
        System.out.println("My make is: "+tonysWhip.GetMake());
        System.out.println("My model is: "+tonysWhip.GetModel());
        System.out.println("My model is: "+tonysWhip.GetYear());
        System.out.println("My max speed is: "+tonysWhip.GetMaxSpeed());

        for(int i = 0; i < 5; i ++)
        {
            tonysWhip.SpeedUp();
        }
        for(int i = 0; i < 5; i ++)
        {
            tonysWhip.SlowDown();
        }
    }
}
