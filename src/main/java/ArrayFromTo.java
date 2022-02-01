public class ArrayFromTo {
    private String[] myArray;

    // constructor sets up some names in the array
    public ArrayFromTo()
    {
        myArray =  new String[8];
        myArray[0] = "Tatjana";
        myArray[1] ="Derek";
        myArray[2] = "John";
        myArray[3] = "James";
        myArray[4] = "Asif";
        myArray[5] = "Sidra";
        myArray[6] = "Wei Lan";
        myArray[7] ="Ameen";
    }

    // Write your printArrayFromTo(int, int) method below
    public void printArrayFromTo(int start, int end){
        if(start > end || start < 0 || end >= myArray.length){
            System.out.println("Error");
            return;
        }

        for(int i = start; i <= end ; i++){
            System.out.println(myArray[i]);
        }

    }
}
