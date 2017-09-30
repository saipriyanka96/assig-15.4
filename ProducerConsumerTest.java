package pctest;
//Package is a grouping of related types providing access protection and name 
//pctest is the package name
public class ProducerConsumerTest { //created the main class ProducerConsumerDemo
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//ProducerConsumerTest class name
	public static void main(String[] args) { //created main method
//static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
					
	
		ProcessData data =new ProcessData(); //created object of the class 
		
		Thread producer = new Thread (new Runnable() {//here creating a producer thread
                                     //here now we create an object which is runnable interface which is anonymous
			
			public void run() {          //created the run method to execute the thread
				for (int number =0;number<11;number++){ //to execute the condition of put and get method data we are using for loop
					
					data.put(number);//put the data of variable
			
				}
				}
		});
          Thread consumer = new Thread(new Runnable (){
        	  
        	  public void run(){
        		  for (int number =0;number<11;number++){
        			
  					data.get();//get the data of variable 
  				
        		  }
        	  }
          }); 
                     producer.start(); //put the data of producer 
                     consumer.start();//get the data of consumer
	}	  
}     