public class myClass{

 

  private String myInstanceVariable;

 

    public myClass(String myConstructorParameter){ //constructor

 

    myInstanceVariable = myConstructorParameter; //does what a setter does


}

      public String geMyInstanceVariable(){ //no parameters?

 

      return myInstanceVariable; //instance variables are accessible to entire class 

    }


    public void printlnMethodForConstructor(){

 

      System.out.printf("You entered the value %s", getMyInstanceVariable()); //look at how he used method in printline here

    }


}







[8:06 AM] Jonathan Pitcher




class Main {


  public static void main(String[] args) {

 

    myClass myObject = new myClass("----my entered Value for instance variale using a constructor----");


    myObject.printlnMethodForConstructor();


  }

}
