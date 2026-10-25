package JavaExercises;


public class ReverseStringName {
    public static void main(String[] args){
        String name = "Jayashnakha";
        String reversed = "";


        for (int i = name.length() -1; i>=0; i--){
            reversed +=name.charAt(i);

        }

        System.out.println("Name without reversed: " +name);
        System.out.println("Name reversed: " + reversed);
    }

}
