public class ajp5 {
    public static void main(String[] args) {
        reverseNo r1 = new reverseNo();
        System.out.println(r1.revNo(54201));
    }
}

class reverseNo{
    int checkDigit(int no){
        int noOfDigit=0;
        while(no>0){
            noOfDigit++;
            no/=10;
        }
        return noOfDigit;
    }
    int revNo(int no){
        int num;
        int revNo=0;
        int noOfDigit =  checkDigit(no);
        while(noOfDigit>=0){
            num=no%10;
            no/=10;
            noOfDigit--;
            revNo += num*(int)(Math.pow(10, noOfDigit));
        }
        return revNo;
    }
}