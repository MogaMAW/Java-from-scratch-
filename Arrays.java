public class Arrays {
    public static void main(String[] args) {
        //Arrays: are used to store multiple values of the same variable 
        //method one of creating an array
        String Name ="Drimmi";
        System.out.println(Name);

        String[] Names ={"Arou","Isaac","Mutua","Brian","Nkata","Joshua","Izaiah","Nathan"};
        Names[0] ="Conrad";
        System.out.println(Names[5]);
        System.out.println(Names[0]);

        //Method two of creating an array is by specifying the number of elements in the array
        //then assign elements into the array 
        //finally print the elements in the array

        String[] cars = new String[5];
        cars[0] ="Toyota";
        cars[1] ="Mercedez";
        cars[2]="Limo";
        cars[3]="Camaro";
        cars[4]="Tesla";

        System.out.println(cars[0]);
        System.out.println(cars[4]);

        //to print out the entire array we use a for loop 
        for(int i =0; i<cars.length;i++)
        System.out.println(cars[i]);
       
    }
    
}
