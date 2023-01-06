public class Car {
     /*Attributes*/ 
     public int size;
     public String color;
     public String model; 

     /*Main Mwthod */
     public static void main(String[] args){
      
        Car redCar = new Car();
        redCar.color ="red";
        redCar.model ="Benz";
        redCar.size = 4;

        Car buleCar = new Car();
        buleCar.color ="bule";
        buleCar.model ="Benz";
        buleCar.size = 4;

        // System.out.println("Car color:" + redCar.color);
        // System.out.println("Car size:" + redCar.size);
        // System.out.println("Car model:" + redCar.model);
        redCar.moveBackward();
        // System.out.println("Car color:" + buleCar.color);
        // System.out.println("Car size:" + buleCar.size);
        // System.out.println("Car model:" + buleCar.model);
        buleCar.moveBackward();
        

        // moveForward();
        // moveBackward();
        // stop();
        // trunonlight();
        // trunofflight();
     }
     /*methode */
	public  void moveForward(){
		System.out.println( this.color + "Move Forward");
    }

    public  void moveBackward(){
		System.out.println(this.color + "Move Backward");
    }
 
    public  void stop(){
		System.out.println(this.color + "stop");
    }
 
    public  void trunonlight(){
		System.out.println(this.color + "trun on light");
    }
    public  void trunofflight(){
		System.out.println(this.color + "trun off light");
    }
}

