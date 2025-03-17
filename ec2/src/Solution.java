public class Solution {
    private int errorCode;
    private String message;

    public Solution(int errorCode, String message){
        this.errorCode=errorCode;
        this.message=message;
    }

    public void show(){
        System.out.println(message);
    }
}
