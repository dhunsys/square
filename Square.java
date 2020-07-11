public class Square {

    public static void main(String args[]) {
            if (args.length == 1) {
            int n = Integer.parseInt(args[0]);
            System.out.println("Square of " + args[0] + " is :" + n * n);
        }else if(args.length==0){
            System.out.println("Must pass one argument");
        }else{
            System.out.println("Invalid argument count");
        }
    }
}
