public class ajp7 {
    public static void main(String[] args) {    
        frequency f2 = new frequency();
        f2.printFreq(3445321);
    }
}
class frequency{
    void printFreq(int num){
        int temp[] = new int[10];

        while(num>0){
            temp[num%10]++;
            num/=10;
        }

        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                System.out.println("Frequency of " + i + " is " + temp[i] + " ");
            }
        }
    }
}