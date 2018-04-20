package sem01;

class Hello implements Runnable {
    String message;
    public Hello(String m) {
        this.message = m;
    }
    public void run() {
        //for (int j=0; j<this.message.length(); j++) {
        //    System.out.print(this.message.charAt(j));
        //}
        System.out.println(message);
    }
}