public class Marcheleventh {
    public static void main(String[] args) {
        int a=5;
        int b[];
        b=new int[10];
        b[0]=1;
        b[1]=1;
                for(int i=2;i<10;i++)
                    b[i]=b[i-1]+b[i-2];
        for(int i=0;i<10;i++)
            System.out.println(b[i]);
    }
}
