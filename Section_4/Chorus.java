public class Chorus {
    public static void main(String[] args) {
        // Chorus needs to be sung 5 times
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        
        // Chorus function is called 5 times
        for (int i = 0; i < 5; i++) {
            singChorus();
        }
        

    }
    //function needs to be static so it can be called in main function which is also static
    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }
}
